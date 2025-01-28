package Setting;

import Entity.Animal.Animals;


import Entity.Animal.Predator.*;
import Entity.Animal.Herbivore.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SettingsAnimals {
    public static final String SYMBOL_WOLF = "\uD83D\uDC3A";
    public static final double WEIGHT_WOLF = 50;
    public static final int MAX_SPEED_WOLF = 3;
    public static final double MAX_SATIETY_WOLF = 8;
    public static final double ACTUAL_SATIETY_WOLF = 8;
    public static final int COUNT_WOLF_ON_ONE_CELL = 30;
    public static final Map<String, Integer> PROBABILITY_BEING_EATEN_WOLF = Stream.of(
                    new Object[][]{
                            {"Boa", 0}, {"Fox", 0}, {"Bear", 0}, {"Eagle", 0}, {"Horse", 10}, {"Deer", 15},
                            {"Rabbit", 60}, {"Mouse", 80}, {"Goat", 60}, {"Sheep", 70}, {"Boar", 15}, {"Buffalo", 10},
                            {"Duck", 40}, {"Caterpillar", 0}, {"Wolf", 0}})
            .collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    public static final String SYMBOL_BOA = "\uD83D\uDC0D";
    public static final double WEIGHT_BOA = 15;
    public static final int MAX_SPEED_BOA = 1;
    public static final double MAX_SATIETY_BOA = 3;
    public static final double ACTUAL_SATIETY_BOA = 3;
    public static final int COUNT_BOA_ON_ONE_CELL = 30;
    public static final Map<String, Integer> PROBABILITY_BEING_EATEN_BOA = Stream.of(
                    new Object[][]{
                            {"Wolf", 0}, {"Fox", 15}, {"Bear", 0}, {"Eagle", 0}, {"Horse", 0}, {"Deer", 0},
                            {"Rabbit", 20}, {"Mouse", 40}, {"Goat", 0}, {"Sheep", 0}, {"Boar", 0}, {"Buffalo", 0},
                            {"Duck", 10}, {"Caterpillar", 0}, {"Boa", 0}})
            .collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    public static final String SYMBOL_FOX = "\uD83E\uDD8A";
    public static final double WEIGHT_FOX = 8;
    public static final int MAX_SPEED_FOX = 2;
    public static final double MAX_SATIETY_FOX = 2;
    public static final double ACTUAL_SATIETY_FOX = 2;
    public static final int COUNT_FOX_ON_ONE_CELL = 30;
    public static final Map<String, Integer> PROBABILITY_BEING_EATEN_FOX = Stream.of(
                    new Object[][]{
                            {"Wolf", 0}, {"Boa", 0}, {"Bear", 0}, {"Eagle", 0}, {"Horse", 0}, {"Deer", 0},
                            {"Rabbit", 70}, {"Mouse", 90}, {"Goat", 0}, {"Sheep", 0}, {"Boar", 0}, {"Buffalo", 0},
                            {"Duck", 60}, {"Caterpillar", 40}, {"Fox", 0}})
            .collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));


    public static final String SYMBOL_EAGLE = "\uD83E\uDD85";
    public static final double WEIGHT_EAGLE = 6;
    public static final int MAX_SPEED_EAGLE = 3;
    public static final double MAX_SATIETY_EAGLE = 1;
    public static final double ACTUAL_SATIETY_EAGLE = 1;
    public static final int COUNT_EAGLE_ON_ONE_CELL = 20;
    public static final Map<String, Integer> PROBABILITY_BEING_EATEN_EAGLE = Stream.of(
                    new Object[][]{
                            {"Wolf", 0}, {"Boa", 0}, {"Fox", 10}, {"Bear", 0}, {"Horse", 0}, {"Deer", 0},
                            {"Rabbit", 90}, {"Mouse", 90}, {"Goat", 0}, {"Sheep", 0}, {"Boar", 0}, {"Buffalo", 0},
                            {"Duck", 80}, {"Caterpillar", 0}, {"Eagle", 0}})
            .collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));


    public static final String SYMBOL_BEAR = "\uD83D\uDC3B";
    public static final double WEIGHT_BEAR = 500;
    public static final int MAX_SPEED_BEAR = 2;
    public static final double MAX_SATIETY_BEAR = 60;
    public static final double ACTUAL_SATIETY_BEAR = 60;
    public static final int COUNT_BEAR_ON_ONE_CELL = 5;
    public static final Map<String, Integer> PROBABILITY_BEING_EATEN_BEAR = Stream.of(
                    new Object[][]{
                            {"Wolf", 0}, {"Boa", 80}, {"Fox", 0}, {"Eagle", 0}, {"Horse", 40}, {"Deer", 80},
                            {"Rabbit", 80}, {"Mouse", 90}, {"Goat", 70}, {"Sheep", 70}, {"Boar", 50}, {"Buffalo", 20},
                            {"Duck", 10}, {"Caterpillar", 0}, {"Bear", 0}})
            .collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));


    public static final String SYMBOL_SHEEP = "\uD83D\uDC11";
    public static final double WEIGHT_SHEEP = 70;
    public static final int MAX_SPEED_SHEEP = 3;
    public static final double MAX_SATIETY_SHEEP = 15;
    public static final double ACTUAL_SATIETY_SHEEP = 15;
    public static final int COUNT_SHEEP_ON_ONE_CELL = 140;

    public static final String SYMBOL_BOAR = "\uD83D\uDC17";
    public static final double WEIGHT_BOAR = 400;
    public static final int MAX_SPEED_BOAR = 2;
    public static final double MAX_SATIETY_BOAR = 50;
    public static final double ACTUAL_SATIETY_BOAR = 50;
    public static final int COUNT_BOAR_ON_ONE_CELL = 50;
    public static final int CHANCE_EAT_CATERPILLAR_BOAR = 90;


    public static final String SYMBOL_BUFFALO = "\uD83D\uDC03";
    public static final double WEIGHT_BUFFALO = 700;
    public static final int MAX_SPEED_BUFFALO = 3;
    public static final double MAX_SATIETY_BUFFALO = 100;
    public static final double ACTUAL_SATIETY_BUFFALO = 100;
    public static final int COUNT_BUFFALO_ON_ONE_CELL = 10;

    public static final String SYMBOL_CATERPILLAR = "\uD83D\uDC1B";
    public static final double WEIGHT_CATERPILLAR = 0.01;
    public static final int MAX_SPEED_CATERPILLAR = 0;
    public static final double MAX_SATIETY_CATERPILLAR = 1;
    public static final double ACTUAL_SATIETY_CATERPILLAR = 1;
    public static final int COUNT_CATERPILLAR_ON_ONE_CELL = 1000;

    public static final String SYMBOL_DEER = "\uD83E\uDD8C";
    public static final double WEIGHT_DEER = 300;
    public static final int MAX_SPEED_DEER = 4;
    public static final double MAX_SATIETY_DEER = 60;
    public static final double ACTUAL_SATIETY_DEER = 60;
    public static final int COUNT_DEER_ON_ONE_CELL = 20;

    public static final String SYMBOL_DUCK = "\uD83E\uDD86";
    public static final double WEIGHT_DUCK = 1;
    public static final int MAX_SPEED_DUCK = 4;
    public static final double MAX_SATIETY_DUCK = 0.15;
    public static final double ACTUAL_SATIETY_DUCK = 0.15;
    public static final int COUNT_DUCK_ON_ONE_CELL = 200;
    public static final int CHANCE_EAT_CATERPILLAR_DUCK = 90;

    public static final String SYMBOL_GOAT = "\uD83D\uDC10";
    public static final double WEIGHT_GOAT = 60;
    public static final int MAX_SPEED_GOAT = 3;
    public static final double MAX_SATIETY_GOAT = 10;
    public static final double ACTUAL_SATIETY_GOAT = 10;
    public static final int COUNT_GOAT_ON_ONE_CELL = 140;

    public static final String SYMBOL_HORSE = "\uD83D\uDC0E";
    public static final double WEIGHT_HORSE = 400;
    public static final int MAX_SPEED_HORSE = 4;
    public static final double MAX_SATIETY_HORSE = 60;
    public static final double ACTUAL_SATIETY_HORSE = 60;
    public static final int COUNT_HORSE_ON_ONE_CELL = 20;

    public static final String SYMBOL_MOUSE = "\uD83D\uDC01";
    public static final double WEIGHT_MOUSE = 0.05;
    public static final int MAX_SPEED_MOUSE = 1;
    public static final double MAX_SATIETY_MOUSE = 0.15;
    public static final double ACTUAL_SATIETY_MOUSE = 0.15;
    public static final int COUNT_MOUSE_ON_ONE_CELL = 500;
    public static final int CHANCE_EAT_CATERPILLAR_MOUSE = 90;

    public static final String SYMBOL_RABBIT = "\uD83D\uDC07";
    public static final double WEIGHT_RABBIT = 2;
    public static final int MAX_SPEED_RABBIT = 2;
    public static final double MAX_SATIETY_RABBIT = 0.45;
    public static final double ACTUAL_SATIETY_RABBIT = 0.45;
    public static final int COUNT_RABBIT_ON_ONE_CELL = 150;

    public static final Map<String, Double> WEIGHT_OF_ALL_EDIBLE_ANIMALS = Stream.of(
                    new Object[][]{
                            {"Wolf", 50.0}, {"Boa", 15.0}, {"Fox", 8.0}, {"Eagle", 6.0}, {"Horse", 400.0}, {"Deer", 300.0},
                            {"Rabbit", 2.0}, {"Mouse", 0.05}, {"Goat", 60.0}, {"Sheep", 70.0}, {"Boar", 400.0}, {"Buffalo", 700.0},
                            {"Duck", 1.0}, {"Caterpillar", 0.01}, {"Bear", 500.0}})
            .collect(Collectors.toMap(data -> (String) data[0], data -> (Double) data[1]));

    public static final Animals[] ALL_ANIMALS = new Animals[]{new Boar(), new Rabbit(), new Caterpillar(), new Bear(), new Fox(), new Deer(), new Mouse(),
                                                new Boa(), new Horse(), new Sheep(), new Duck(), new Wolf(), new Goat(), new Eagle(), new Buffalo()};

    public static final int[] COUNT_ON_CELL_ALL_ANIMALS = new int[]{50, 150, 1000, 5, 30, 20, 500, 30, 20, 140, 200, 30, 140, 20, 10};
}
