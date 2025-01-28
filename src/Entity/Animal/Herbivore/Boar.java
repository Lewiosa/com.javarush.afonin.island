package Entity.Animal.Herbivore;

import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Boar extends Herbivore {
    private int chanceEatCaterpillarBoar;
    public Boar() {
        super.setSymbol(SettingsAnimals.SYMBOL_BOAR);
        super.setWeight(SettingsAnimals.WEIGHT_BOAR);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_BOAR);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_BOAR);
        super.setCountOnOneCell(SettingsAnimals.COUNT_BOAR_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_BOAR);
        super.setChanceEatCaterpillar(SettingsAnimals.CHANCE_EAT_CATERPILLAR_BOAR);
        super.setRandomCount(ThreadLocalRandom.current().nextInt(0, SettingsAnimals.COUNT_BOAR_ON_ONE_CELL + 1));

    }
}
