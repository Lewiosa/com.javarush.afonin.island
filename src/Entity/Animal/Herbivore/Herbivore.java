package Entity.Animal.Herbivore;

import Entity.Animal.Animals;
import Setting.Cell;
import Entity.Plant.Plants;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Herbivore extends Animals {
    Lock lock = new ReentrantLock();

    @Override
    public boolean eat(Cell cell) {
        lock.lock();
        try {
            if (actualSatiety >= maxSatiety) {
                actualSatiety = maxSatiety;
                return true;
            }
            CopyOnWriteArrayList<Plants> listPlant = cell.listPlant;
            if (listPlant.isEmpty()) {
                return false;
            }
            for (Plants plant : listPlant) {
                int weightPlant = (int) Plants.getWeightPlant();
                if (weightPlant > maxSatiety) {
                    actualSatiety = maxSatiety;
                    cell.listPlant.remove(plant);
                } else {
                    actualSatiety = actualSatiety + weightPlant;
                    cell.listPlant.remove(plant);
                }
                return true;
            }
        }finally {
            lock.unlock();
        }
        return true;
    }
}
