package Entity.Animal.Herbivore;

import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Goat extends Herbivore {

    public Goat() {
        super.setSymbol(SettingsAnimals.SYMBOL_GOAT);
        super.setWeight(SettingsAnimals.WEIGHT_GOAT);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_GOAT);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_GOAT);
        super.setCountOnOneCell(SettingsAnimals.COUNT_GOAT_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_GOAT);
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_GOAT_ON_ONE_CELL + 1));

    }
}
