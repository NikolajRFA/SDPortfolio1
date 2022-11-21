public class Container extends Vessel {
    private final int CAPACITY;
    private int containersOnBoard;


    public Container(int length, int width, float draft, String flagNation, int capacity) {
        super(length, width, draft, flagNation);
        this.CAPACITY = capacity;
    }

    @Override
    public boolean loadingCargo(Cargo cargo) {
        if (cargo instanceof ContainerCargo thisCargo) {
            if (containersOnBoard + thisCargo.getQUANTITY() <= CAPACITY) {
                containersOnBoard += thisCargo.getQUANTITY();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public double utilityLevelOfCapacity() {
        return (double) containersOnBoard / CAPACITY;
    }
}
