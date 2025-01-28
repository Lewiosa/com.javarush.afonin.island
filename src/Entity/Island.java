package Entity;

import Setting.Cell;
import Setting.Sentence;

import java.util.Scanner;

public class Island {
    private static int x;
    private static int y;
    private Scanner input = new Scanner(System.in);
    public Cell[][] islandArray;


    public Island() {
        System.out.println(Sentence.INPUT_SIZE_ISLAND);
        x = input.nextInt();
        y = input.nextInt();
        islandArray = new Cell[x][y];
        System.out.printf(Sentence.CREATE_ISLAND, x, y);

        try {
            Thread.sleep(500);
            System.out.println(Sentence.ANIMALS_IN_LOCATION);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("WAIT!!! BUUUUUG!!!");
        }
    }



}
