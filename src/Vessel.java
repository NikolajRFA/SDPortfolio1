public abstract class Vessel {
    private final int LENGTH, WIDTH;
    private final float DRAFT;
    private final String FLAG_NATION;

    protected Vessel(int length, int width, float draft, String flagNation) {
        this.LENGTH = length;
        this.WIDTH = width;
        this.DRAFT = draft;
        this.FLAG_NATION = flagNation;
    }

    public abstract double utilityLevelOfCapacity();
    public abstract boolean loadingCargo(Cargo cargo);
    public void sailTo(String coords) {}
    public String getCoordinates(){return null;}
    public static Vessel findSuitableVessel(Vessel[] vessels, String vesselType, int spaceNeeded) {
        return null;
    }
}