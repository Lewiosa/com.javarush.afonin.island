package General;

import Entity.Island;

import Setting.SettingsIsland;
import Setting.Statistic;
import Worker.AnimalWorker;
import worker.PlantsWorker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



public class CreatingMultithreading {
    //Поток с жизненным циклом симуляции
    private ScheduledExecutorService executorSimulationService;
    // Поток с обработкой животных
    private ExecutorService serviceForCreaturesWorker;
    //Поток с растениями
    private ScheduledExecutorService executorServicePlant;
    private Island island;

    //Конструктор
    public CreatingMultithreading(Island island) {
        this.island = island;
        this.executorSimulationService = Executors.newScheduledThreadPool(SettingsIsland.getCountThreadShed());
        this.serviceForCreaturesWorker = Executors.newFixedThreadPool(SettingsIsland.getCountThread());
        this.executorServicePlant = Executors.newScheduledThreadPool(SettingsIsland.getCountThreadShedPlant());
    }


    public void islandStartLive() {
        executorSimulationService.scheduleWithFixedDelay(this::lifeCycle, 0, 1, TimeUnit.SECONDS);
        executorServicePlant.scheduleWithFixedDelay(new PlantsWorker(island), 0, 800, TimeUnit.MILLISECONDS);
    }

    private void lifeCycle() {
        AnimalWorker animalWorker = new AnimalWorker(island);
        serviceForCreaturesWorker.execute(animalWorker);
        if (Statistic.countNumberAnimal(island) == 0) {
           stopSimulation();
        }
 }
    private void shutdownService(ExecutorService service, int timeout) {
        service.shutdown();
        try {
            if (!service.awaitTermination(timeout, TimeUnit.SECONDS)) {
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            service.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    private void stopSimulation() {
        shutdownService(serviceForCreaturesWorker, 1);
        shutdownService(executorSimulationService, 1);
        shutdownService(executorServicePlant, 2);
        System.out.println("Конец симуляции");
    }
}
