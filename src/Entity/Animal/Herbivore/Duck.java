package Entity.Animal.Herbivore;

import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Duck extends Herbivore {

    public Duck() {
        super.setSymbol(SettingsAnimals.SYMBOL_DUCK);
        super.setWeight(SettingsAnimals.WEIGHT_DUCK);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_DUCK);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_DUCK);
        super.setCountOnOneCell(SettingsAnimals.COUNT_DUCK_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_DUCK);
        super.setChanceEatCaterpillar(SettingsAnimals.CHANCE_EAT_CATERPILLAR_DUCK);;
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_DUCK_ON_ONE_CELL + 1));

    }
}
