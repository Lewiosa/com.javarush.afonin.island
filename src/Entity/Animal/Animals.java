package Entity.Animal;

import Entity.Island;
import Create.AnimalCreate;
import Setting.Cell;
import Setting.Direction;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public abstract class Animals implements Cloneable {
    /*Символ
     * Вес
     * Максимальная скорость
     * Максимальное насыщение
     * Фактическая сытость
     * Количество животных на одной клетке
     * Вероятности съедения животного
     * Шанс съедения гусеницы
     * Шанс появления при инициализации острова
     * Шанс заселения на ячейку
     * Символ животного */
    private double weight;
    private int maxSpeed;
    protected double  maxSatiety;
    protected double actualSatiety;
    private int countOnOneCell;
    private Map<String, Integer> probabilityEaten;
    private int chanceEatCaterpillar;
    private int randomCount;
    private String symbol;
    Lock lock = new ReentrantLock();

    public void setRandomCount(int randomCount) {
        this.randomCount = randomCount;
    }

    //Геттеры
    public double getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }

    public double getActualSatiety() {
        return actualSatiety;
    }

    public int getCountOnOneCell() {
        return countOnOneCell;
    }

    public Map<String, Integer> getProbabilityEaten() {
        return probabilityEaten;
    }

    public int getChanceEatCaterpillar() {
        return chanceEatCaterpillar;
    }


    //Сеттеры
    public void setProbabilityEaten(Map<String, Integer> probabilityBeingEatenWolf) {
        this.probabilityEaten = probabilityBeingEatenWolf;
    }

    public void setCountOnOneCell(int countOnOneCell) {
        this.countOnOneCell = countOnOneCell;
    }

    public void setActualSatiety(double actualSatiety) {
        this.actualSatiety = actualSatiety;
    }

    public void setMaxSatiety(double maxSatiety) {
        this.maxSatiety = maxSatiety;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setChanceEatCaterpillar(int chanceEatCaterpillar) {
        this.chanceEatCaterpillar = chanceEatCaterpillar;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Уменьшение значения поля текущей сытости
    //Уменьшение сытости на 25%
    public void worker() {
        lock.lock();
        try {
            this.actualSatiety -= (maxSatiety * 0.25);
        } finally {
            lock.unlock();
        }
    }

    //Съесть растение
    public boolean eat(Cell cell) {
        if (actualSatiety >= maxSatiety) {
            return false; // Животное сыто
        }
        return true;
    }

    // Переместиться в другую локацию
    public void move(Island island) {
        lock.lock();
        try {
            // Найти текущую клетку, в которой находится животное
            Cell currentCell = findCurrentCell(island);
            if (currentCell == null) return;

            int currentRow = -1;
            int currentCol = -1;

            // Найти индексы текущей клетки в массиве islandArray
            boolean flag = false;
            for (int i = 0; i < island.islandArray.length; i++) {
                for (int j = 0; j < island.islandArray[i].length; j++) {
                    if (island.islandArray[i][j] == currentCell) {
                        currentRow = i;
                        currentCol = j;
                        flag = true;
                    }
                }
                if (flag) break;
            }

            if (currentRow == -1 || currentCol == -1) return; // Не удалось найти текущую клетку

            // Случайный шаг и направление
            int randomStep = ThreadLocalRandom.current().nextInt(0, maxSpeed + 1);
            Direction direction = Direction.randomDirection();

            // Рассчитать новые координаты
            int newRow = (currentRow + direction.getDeltaRow() * randomStep + island.islandArray.length) % island.islandArray.length;
            int newCol = (currentCol + direction.getDeltaCol() * randomStep + island.islandArray[currentRow].length) % island.islandArray[currentRow].length;

            // Переместить животное, если в новой клетке есть место
            Cell targetCell = island.islandArray[newRow][newCol];
            if (targetCell.listAnimal.size() < countOnOneCell) {
                currentCell.listAnimal.remove(this);
                targetCell.listAnimal.add(this);
            }
        } finally {
            lock.unlock();
        }
    }

    private Cell findCurrentCell(Island island) {
        for (Cell[] row : island.islandArray) {
            for (Cell cell : row) {
                if (cell.listAnimal.contains(this)) {
                    return cell;
                }
            }
        }
        return null; // Если животное не найдено в острове
    }

    //Размножение
    public void reproduce(Cell cell) {
        lock.lock();
        try {
            long countSameAnimals = cell.listAnimal.stream()
                    .filter(animal -> this.getClass().equals(animal.getClass()))
                    .count();

            if (countSameAnimals >= countOnOneCell) {
                //System.out.println(this.getClass().getSimpleName() + ": Клетка переполнена для этого типа.");
                return;
            }

            int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
            if (randomNum < 20) { // Шанс на размножение 20%
                //System.out.println(this.getClass().getSimpleName() + ": Шанс на размножение не выпал.");
                return;
            }

            Animals baby = AnimalCreate.giveBirthAnimal(this.getClass().getSimpleName());
            if (baby != null && countSameAnimals > 2) {
                cell.listAnimal.add(baby);
                //System.out.println(this.getClass().getSimpleName() + ": Успешное размножение. Рождено новое животное.");
            } else {
                //System.err.println("Ошибка при создании потомства для: " + this.getClass().getSimpleName());
            }
        } finally {
            lock.unlock();
        }
    }

    //Смерть
    public void die(Cell cell) {
        lock.lock();
        try {
            // Проверяем, достаточно ли сытости для выживания
            if (actualSatiety <= 0) {
                if (cell.listAnimal.contains(this)) {
                    cell.listAnimal.remove(this); // Удаляем животное из клетки
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
