public class Container extends Vessel {
    private final int CAPACITY;
    private int containersOnBoard;


    public Container(int length, int width, float draft, String flagNation, int capacity) {
        super(length, width, draft, flagNation);
        this.CAPACITY = capacity;
    }

    public boolean loadingCargo(Cargo cargo) {
        if (cargo instanceof Cont) {
            if (containersOnBoard + ((Cont) cargo).getQuantity() <= CAPACITY) {
                containersOnBoard += ((Cont) cargo).getQuantity();
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
