package Setting;

import Entity.Island;
import Entity.Animal.Herbivore.*;
import Entity.Animal.Predator.*;
import java.util.Arrays;

public class Statistic {
    // Вывод статистики на экран
    public static void collectingStatistics(Island island) {

        int sizePlant = Arrays.stream(island.islandArray).flatMap(Arrays::stream).mapToInt(cell -> cell.listPlant.size()).sum();
        int sizeWolf = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Wolf).map(c -> (Wolf) c).toList().size();
        int sizeBear = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Bear).map(c -> (Bear) c).toList().size();
        int sizeBoa = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Boa).map(c -> (Boa) c).toList().size();
        int sizeFox = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Fox).map(c -> (Fox) c).toList().size();
        int sizeEagle = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Eagle).map(c -> (Eagle) c).toList().size();
        int sizeSheep = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Sheep).map(c -> (Sheep) c).toList().size();
        int sizeDeer = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Deer).map(c -> (Deer) c).toList().size();
        int sizeBuffalo = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Buffalo).map(c -> (Buffalo) c).toList().size();
        int sizeRabbit = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream()).
                filter(c -> c instanceof Rabbit).map(c -> (Rabbit) c).toList().size();
        int sizeGoat = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Goat).map(c -> (Goat) c).toList().size();
        int sizeMouse = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Mouse).map(c -> (Mouse) c).toList().size();
        int sizeDuck = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Duck).map(c -> (Duck) c).toList().size();
        int sizeHorse = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Horse).map(c -> (Horse) c).toList().size();
        int sizeBoar = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Boar).map(c -> (Boar) c).toList().size();
        int sizeCaterpillar = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Caterpillar).map(c -> (Caterpillar) c).toList().size();

        System.out.print(SettingsAnimals.SYMBOL_WOLF + ": " + sizeWolf
                + " | " + SettingsAnimals.SYMBOL_SHEEP + ": " + sizeSheep
                + " | " + SettingsAnimals.SYMBOL_BEAR + ": " + sizeBear
                + " | " + SettingsAnimals.SYMBOL_BOA + ": " + sizeBoa
                + " | " + SettingsAnimals.SYMBOL_FOX + " :" + sizeFox
                + " | " + SettingsAnimals.SYMBOL_EAGLE + ": " + sizeEagle
                + " | " + SettingsAnimals.SYMBOL_DEER + ": " + sizeDeer
                + " | " + SettingsAnimals.SYMBOL_BUFFALO + ": " + sizeBuffalo
                + " | " + SettingsAnimals.SYMBOL_RABBIT + ": " + sizeRabbit
                + " | " + SettingsAnimals.SYMBOL_GOAT + ": " + sizeGoat
                + " | " + SettingsAnimals.SYMBOL_MOUSE + ": " + sizeMouse
                + " | " + SettingsAnimals.SYMBOL_DUCK + ": " + sizeDuck
                + " | " + SettingsAnimals.SYMBOL_HORSE + ": " + sizeHorse
                + " | " + SettingsAnimals.SYMBOL_BOAR + ": " + sizeBoar
                + " | " + SettingsAnimals.SYMBOL_CATERPILLAR + ": " + sizeCaterpillar + "\n");

        int sizePredator = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Predator).map(c -> (Predator) c).toList().size();
        int sizeHerbivore = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Herbivore).map(c -> (Herbivore) c).toList().size();
        System.out.print( "Растений: " + sizePlant + "|" + "Травоядных: " + sizeHerbivore + "|" + "Хищников: " + sizePredator + "\n");


    }
    // Функция возвращения общго количества хищников и травоядных
    public static int countNumberAnimal(Island island) {
        int sizePredator = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Predator).map(c -> (Predator) c).toList().size();
        int sizeHerbivore = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Herbivore).map(c -> (Herbivore) c).toList().size();
        return sizeHerbivore + sizePredator;
    }

}

