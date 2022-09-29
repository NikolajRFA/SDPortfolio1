public class RoRo extends Vessel{
    private final int LANE_METERS;
    private int usedLaneMeters;


    public RoRo(int length, int width, float draft, String flagNation, int laneMeters) {
        super(length, width, draft, flagNation);
        this.LANE_METERS = laneMeters;
    }

    public boolean loadingCargo(int cars, int trucks) {
        int TRUCK_LENGTH = 30; // meters
        int CAR_LENGTH = 8; // meters
        int carsAndTrucksLaneMeters = cars * CAR_LENGTH + trucks * TRUCK_LENGTH;
        if (carsAndTrucksLaneMeters + usedLaneMeters > LANE_METERS) {
            return false;
        }
        usedLaneMeters = carsAndTrucksLaneMeters;
        return true;
    }
    @Override
    public double utilityLevelOfCapacity() {
        return (double) usedLaneMeters / LANE_METERS;
    }
}
