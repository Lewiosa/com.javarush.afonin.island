package Setting;

public class SettingsIsland {
    private static int chanceCreating = 10;
    private static int countThread = 4;
    private static int countThreadShed = 2;
    private static int countThreadShedPlant = 2;

    public static int getChanceCreating() {
        return chanceCreating;
    }

    public static int getCountThreadShedPlant() {
        return countThreadShedPlant;
    }

    public static int getCountThreadShed() {
        return countThreadShed;
    }

    public static int getCountThread() {
        return countThread;
    }
}
