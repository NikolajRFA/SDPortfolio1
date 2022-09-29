import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankerTest {
    @Test
    void loadTank() {
        Tanker t = new Tanker(20, 30, 2.3f, "DK", 8);
        boolean loadWentWell = t.loadingCargo(0, 23);
        assertTrue(loadWentWell);
    }

    @Test
    void cantOverfill() {
        Tanker t = new Tanker(20, 30, 2.3f, "DK", 8);
        boolean loadWentWell = t.loadingCargo(0, 101);
        assertFalse(loadWentWell);
    }

    /*@Test
    void cantLoadIntoNonExistentTank() {
        Tanker t = new Tanker(20, 30, 2.3f, "DK", 8);
        boolean loadWentWell = t.loadingCargo(-1, 20);
        assertFalse(loadWentWell);
    }*/

    @Test
    void computeFractionOfTanksUsed() {
        Tanker t = new Tanker(20, 30, 2.3f, "DK", 8);
        t.loadingCargo(0, 20);
        t.loadingCargo(1, 30);
        assertEquals(0.25, t.utilityLevelOfCapacity(), 0.001);
    }

    @Test
    void tankCapacityLeft() {
        Tank t = new Tank(100, 20);
        t.fill(60);
        assertEquals(20, t.capacityLeft());
    }
}