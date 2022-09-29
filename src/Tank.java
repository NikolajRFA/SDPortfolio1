public class Tank {
    private final int CAPACITY; // Liters
    private int fill; // Liters in tank

    public Tank(int capacity, int fill) {
        this.CAPACITY = capacity;
        this.fill = fill;
    }

    public Tank(int capacity) {
        this.CAPACITY = capacity;
        fill = 0;
    }

    public int capacityLeft() {
        return CAPACITY - fill;
    }

    public boolean fill(int liters) {
        if (liters <= CAPACITY - fill) {
            fill += liters;
            return true;
        }
        return false;
    }

    public boolean hasLiquid() {
        return fill > 0;
    }
}
