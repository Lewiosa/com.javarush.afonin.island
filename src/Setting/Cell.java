package Setting;

import Entity.Animal.Animals;
import Entity.Plant.Plants;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Cell {
    public Lock lock = new ReentrantLock();

    private static final CountDownLatch START = new CountDownLatch(4);
    public CopyOnWriteArrayList<Animals> listAnimal = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<Plants> listPlant = new CopyOnWriteArrayList<>();
}
