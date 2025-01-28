package Entity.Animal.Predator;

import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Predator {
    public Bear() {
        super.setSymbol(SettingsAnimals.SYMBOL_BEAR);
        super.setWeight(SettingsAnimals.WEIGHT_BEAR);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_BEAR);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_BEAR);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_BEAR);
        super.setCountOnOneCell(SettingsAnimals.COUNT_BEAR_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimals.PROBABILITY_BEING_EATEN_BEAR);
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_BEAR_ON_ONE_CELL + 1));

    }
}
