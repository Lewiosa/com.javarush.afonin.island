package Worker;

import Entity.Animal.Animals;
import Entity.Island;
import Setting.Cell;
import Setting.Statistic;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;

public class AnimalWorker implements Runnable {
    private final Island island;
    public static final AtomicInteger countDay = new AtomicInteger(1);
    private final ConcurrentLinkedQueue<worker.Task> tasks = new ConcurrentLinkedQueue<>();
    private static final ForkJoinPool pool = new ForkJoinPool(); // Пул потоков для параллельной обработки

    public AnimalWorker(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        // Параллельная обработка строк острова
        pool.submit(() -> {
            Arrays.stream(island.islandArray).parallel().forEach(cells -> {
                for (Cell cell : cells) {
                    processCell(cell);
                }
            });
        }).join();

        // Логирование дня и статистики
        System.out.println("День: " + countDay.getAndIncrement());
        Statistic.collectingStatistics(island);
        System.out.println();
    }

    private void processCell(Cell cell) {
        CopyOnWriteArrayList<Animals> animalList = cell.listAnimal;

        for (Animals animal : animalList) {
            try {
                // Создаем задачу для каждого животного и выполняем её
                worker.Task task = new worker.Task(animal, cell, island);
                task.doTask();
                logAnimalAction(animal, "Выполнил задачу");
            } catch (Exception e) {
                System.err.println("Ошибка при выполнении задачи для животного: " + animal.getClass().getSimpleName());
                e.printStackTrace();
            }
        }
    }

    // Логирование действий животных
    private void logAnimalAction(Animals animal, String message) {
        //System.out.println(animal.getClass().getSimpleName() + ": " + message);
    }
}