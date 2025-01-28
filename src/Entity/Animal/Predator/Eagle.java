package Entity.Animal.Predator;

import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Eagle extends Predator {
    public Eagle() {
        super.setSymbol(SettingsAnimals.SYMBOL_EAGLE);
        super.setWeight(SettingsAnimals.WEIGHT_EAGLE);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_EAGLE);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_EAGLE);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_EAGLE);
        super.setCountOnOneCell(SettingsAnimals.COUNT_EAGLE_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimals.PROBABILITY_BEING_EATEN_EAGLE);
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_EAGLE_ON_ONE_CELL + 1));

    }
}
