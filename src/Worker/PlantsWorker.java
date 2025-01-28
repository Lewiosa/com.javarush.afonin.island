package worker;

import Entity.Island;
import Entity.Plant.Plants;

public class PlantsWorker implements Runnable{
    Island island;
    int maxCountPlant = Plants.maxCountPlant;

    public PlantsWorker(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        try {
            plantGrowth();
        } catch (Exception e) {
            System.err.println("OMG! Debug it!");
            System.exit(0);
        }
    }

    public void plantGrowth() {
        for (int i = 0; i < island.islandArray.length; i++) {
            for (int j = 0; j < island.islandArray[i].length; j++) {
                if (island.islandArray[i][j].listPlant.size() <= maxCountPlant) {
                    island.islandArray[i][j].listPlant.add(new Plants());
                } else {
                    return;
                }
            }
        }
    }
}

