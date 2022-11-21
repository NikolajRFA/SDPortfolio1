public class RoRoCargo extends Cargo {
    private final int CARS;
    private final int TRUCKS;

    RoRoCargo(int cars, int trucks) {
        CARS = cars;
        TRUCKS = trucks;
    }

    public int getCARS() {
        return CARS;
    }

    public int getTRUCKS() {
        return TRUCKS;
    }
}
