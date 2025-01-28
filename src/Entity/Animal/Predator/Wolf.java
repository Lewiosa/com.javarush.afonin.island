package Entity.Animal.Predator;

import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Predator {
    public Wolf() {
        super.setSymbol(SettingsAnimals.SYMBOL_WOLF);
        super.setWeight(SettingsAnimals.WEIGHT_WOLF);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_WOLF);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_WOLF);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_WOLF);
        super.setCountOnOneCell(SettingsAnimals.COUNT_WOLF_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimals.PROBABILITY_BEING_EATEN_WOLF);
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_WOLF_ON_ONE_CELL + 1));

    }
}
