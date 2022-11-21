public class ContainerCargo extends Cargo {
    private final int QUANTITY;

    ContainerCargo(int quantity) {
        this.QUANTITY = quantity;
    }

    public int getQUANTITY() {
        return QUANTITY;
    }
}
