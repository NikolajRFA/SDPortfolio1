public class Tanker extends Vessel {
    private final Tank[] tanks;

    public Tanker(int length, int width, float draft, String flagNation, int compartments) {
        super(length, width, draft, flagNation);
        // If too many or too little compartments, default to extremes.
        if (compartments < 1) {
           this.tanks = new Tank[1];
        } else if (compartments > 10) {
            this.tanks = new Tank[10];
        } else {
            this.tanks = new Tank[compartments];
        }

        for (int i = 0; i < this.tanks.length; i++) {
            int DEFAULT_CAPACITY = 100;
            this.tanks[i] = new Tank(DEFAULT_CAPACITY);
        }
    }

    public boolean loadingCargo(Cargo cargo) {
        if (cargo instanceof TankerCargo thisCargo) {
            if (thisCargo.getCOMPARTMENT_INDEX() > tanks.length) {
                System.out.println("Can't load into that compartment!");
                return false;
            } else return tanks[thisCargo.getCOMPARTMENT_INDEX()].fill(thisCargo.getLITERS_TO_FILL());
        }
        return false;
    }

    @Override
    public double utilityLevelOfCapacity() {
        int counter = 0;
        for (Tank tank : tanks) {
            if (tank.hasLiquid()) {
                counter++;
            }
        }
        return (double) counter /  tanks.length;
    }
}
