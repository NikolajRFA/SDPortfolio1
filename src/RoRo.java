public class RoRo extends Vessel{
    private final int LANE_METERS;
    private int usedLaneMeters;


    public RoRo(int length, int width, float draft, String flagNation, int laneMeters) {
        super(length, width, draft, flagNation);
        this.LANE_METERS = laneMeters;
    }

    public boolean loadingCargo(Cargo cargo) {
        // Check if the cargo is compatible.
        if (cargo instanceof RoRoCargo thisCargo) {
            int TRUCK_LENGTH = 30; // meters
            int CAR_LENGTH = 8; // meters
            int carsAndTrucksLaneMeters = thisCargo.getCARS() * CAR_LENGTH + thisCargo.getTRUCKS() * TRUCK_LENGTH;
            // If not enough space
            if (carsAndTrucksLaneMeters + usedLaneMeters > LANE_METERS) {
                return false;
            }
            usedLaneMeters = carsAndTrucksLaneMeters;
            return true;
        }
        return false;
    }
    @Override
    public double utilityLevelOfCapacity() {
        return (double) usedLaneMeters / LANE_METERS;
    }
}
