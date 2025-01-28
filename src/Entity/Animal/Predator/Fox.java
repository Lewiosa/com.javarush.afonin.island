package Entity.Animal.Predator;

import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Fox extends Predator {
    public Fox() {
        super.setSymbol(SettingsAnimals.SYMBOL_FOX);
        super.setWeight(SettingsAnimals.WEIGHT_FOX);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_FOX);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_FOX);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_FOX);
        super.setCountOnOneCell(SettingsAnimals.COUNT_FOX_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimals.PROBABILITY_BEING_EATEN_FOX);
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_FOX_ON_ONE_CELL + 1));

    }
}
