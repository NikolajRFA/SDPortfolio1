public class Container extends Vessel {
    private final int CAPACITY;
    private int containersOnBoard;


    public Container(int length, int width, float draft, String flagNation, int capacity) {
        super(length, width, draft, flagNation);
        this.CAPACITY = capacity;
    }

    public boolean loadingCargo(int numContainers) {
        if (containersOnBoard + numContainers <= CAPACITY) {
            containersOnBoard += numContainers;
            return true;
        }
        return false;
    }

    @Override
    public double utilityLevelOfCapacity() {
        return (double) containersOnBoard / CAPACITY;
    }
}
