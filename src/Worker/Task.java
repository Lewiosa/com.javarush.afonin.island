package worker;

import Entity.Animal.Animals;
import Entity.Island;
import Setting.Cell;

public class Task {
    private final Animals animal;
    private final Cell cell;
    private final Island island;

    public Task(Animals animal, Cell cell, Island island) {
        this.animal = animal;
        this.cell = cell;
        this.island = island;
    }

    public void doTask() {
        // Уменьшение сытости
        animal.worker();

        // Попытка поесть
        boolean ate = animal.eat(cell);

        // Размножение (если поел)
        if (ate) {
            animal.reproduce(cell);
        }

        // Проверка на смерть
        animal.die(cell);

        // Перемещение
        animal.move(island);
    }
}


