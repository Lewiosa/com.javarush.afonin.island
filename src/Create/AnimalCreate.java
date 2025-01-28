package Create;

import Entity.Animal.Animals;
import Entity.Animal.Predator.*;
import Entity.Animal.Herbivore.*;

public class AnimalCreate {
    public static Animals giveBirthAnimal(String simpleName) {
        Animals animalBaby = null;
        switch (simpleName) {
            case "Boa" -> animalBaby = new Boa();
            case "Wolf" -> animalBaby = new Wolf();
            case "Sheep" -> animalBaby = new Sheep();
            case "Rabbit" -> animalBaby = new Rabbit();
            case "Fox" -> animalBaby = new Fox();
            case "Bear" -> animalBaby = new Bear();
            case "Eagle" -> animalBaby = new Eagle();
            case "Boar" -> animalBaby = new Boar();
            case "Buffalo" -> animalBaby = new Buffalo();
            case "Caterpillar" -> animalBaby = new Caterpillar();
            case "Deer" -> animalBaby = new Deer();
            case "Duck" -> animalBaby = new Duck();
            case "Goat" -> animalBaby = new Goat();
            case "Horse" -> animalBaby = new Horse();
            case "Mouse" -> animalBaby = new Mouse();
        }
        // System.out.println("Создалось новое животное");
        return animalBaby;
    }
}