package General;

import Entity.Island;

public class App {
    public static void main(String[] args) {

        Island island = new Island();
        IslandInitialization.start(island);
        CreatingMultithreading creatingMultithreading = new CreatingMultithreading(island);
        creatingMultithreading.islandStartLive();


    }


}
