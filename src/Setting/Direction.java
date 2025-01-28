package Setting;

import java.util.concurrent.ThreadLocalRandom;
public enum Direction {
    UP(-1, 0),
    DOWN(1, 0),
    LEFT(0, -1),
    RIGHT(0, 1),
    DIAGONAL_UP_RIGHT(-1, 1),
    DIAGONAL_UP_LEFT(-1, -1),
    DIAGONAL_DOWN_RIGHT(1, 1),
    DIAGONAL_DOWN_LEFT(1, -1);
    private final int deltaRow;
    private final int deltaCol;
    Direction(int deltaRow, int deltaCol) {
        this.deltaRow = deltaRow;
        this.deltaCol = deltaCol;
    }
    public int getDeltaRow() {
        return deltaRow;
    }
    public int getDeltaCol() {
        return deltaCol;
    }
    public static Direction randomDirection() {
        Direction[] directions = values();
        return directions[ThreadLocalRandom.current().nextInt(directions.length)];
    }
    }