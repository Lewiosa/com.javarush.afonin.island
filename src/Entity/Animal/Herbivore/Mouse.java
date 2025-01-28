package Entity.Animal.Herbivore;

import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Mouse extends Herbivore {

    public Mouse() {
        super.setSymbol(SettingsAnimals.SYMBOL_MOUSE);
        super.setWeight(SettingsAnimals.WEIGHT_MOUSE);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_MOUSE);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_MOUSE);
        super.setCountOnOneCell(SettingsAnimals.COUNT_MOUSE_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_MOUSE);
        super.setChanceEatCaterpillar(SettingsAnimals.CHANCE_EAT_CATERPILLAR_MOUSE);
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_MOUSE_ON_ONE_CELL + 1));

    }
}
