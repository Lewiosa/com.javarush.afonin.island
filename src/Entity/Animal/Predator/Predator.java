package Entity.Animal.Predator;

import Entity.Animal.Animals;
import Setting.Cell;
import Setting.SettingsAnimals;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Predator extends Animals {

    Lock lock = new ReentrantLock();

    @Override
    public boolean eat(Cell cell) {
        lock.lock();
        try {
            if (actualSatiety >= maxSatiety) {
                actualSatiety = maxSatiety;
                return true;
            }
            CopyOnWriteArrayList<Animals> listAnimal = cell.listAnimal;
            if (listAnimal.isEmpty()) {
                return false;
            }
            List<Animals> listFilter = listAnimal.stream().filter(animal -> this.getProbabilityEaten().getOrDefault
                            (animal.getClass().getSimpleName(), 0) > 0).sorted((a1, a2) -> Integer.compare(
                            this.getProbabilityEaten().getOrDefault(a2.getClass().getSimpleName(), 0),
                            this.getProbabilityEaten().getOrDefault(a1.getClass().getSimpleName(), 0)
                    ))
                    .toList();
            if (listFilter.isEmpty()) {
                return false;
            }
            Animals first = listFilter.getFirst();
            Integer probability = this.getProbabilityEaten().get(first.getClass().getSimpleName());
            int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
            if (probability >= randomNum) {
                Double weightFood = SettingsAnimals.WEIGHT_OF_ALL_EDIBLE_ANIMALS.get(first.getClass().getSimpleName());
                if (weightFood > maxSatiety) {
                    actualSatiety = maxSatiety;
                } else {
                    actualSatiety += weightFood;
                }
                cell.listAnimal.remove(first);
            }
        } finally {
            lock.unlock();
        }
        return true;
    }
}