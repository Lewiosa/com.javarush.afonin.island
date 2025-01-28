package Entity.Animal.Herbivore;

import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Caterpillar extends Herbivore {

    public Caterpillar() {
        super.setSymbol(SettingsAnimals.SYMBOL_CATERPILLAR);
        super.setWeight(SettingsAnimals.WEIGHT_CATERPILLAR);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_CATERPILLAR);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_CATERPILLAR);
        super.setCountOnOneCell(SettingsAnimals.COUNT_CATERPILLAR_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_CATERPILLAR);
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_CATERPILLAR_ON_ONE_CELL + 1));
    }
}
