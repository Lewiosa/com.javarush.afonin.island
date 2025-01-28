package Entity.Animal.Herbivore;

import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Rabbit extends Herbivore {

    public Rabbit() {
        super.setSymbol(SettingsAnimals.SYMBOL_RABBIT);
        super.setWeight(SettingsAnimals.WEIGHT_RABBIT);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_RABBIT);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_RABBIT);
        super.setCountOnOneCell(SettingsAnimals.COUNT_RABBIT_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_RABBIT);
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_RABBIT_ON_ONE_CELL + 1));

    }
}
