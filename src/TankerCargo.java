public class TankerCargo extends Cargo {
    private final int COMPARTMENT_INDEX;
    private final int LITERS_TO_FILL;

    public TankerCargo(int COMPARTMENT_INDEX, int LITERS_TO_FILL) {
        this.COMPARTMENT_INDEX = COMPARTMENT_INDEX;
        this.LITERS_TO_FILL = LITERS_TO_FILL;
    }

    public int getCOMPARTMENT_INDEX() {
        return COMPARTMENT_INDEX;
    }

    public int getLITERS_TO_FILL() {
        return LITERS_TO_FILL;
    }
}
