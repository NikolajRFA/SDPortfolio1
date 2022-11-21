import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoRoTest {
    @Test
    void loadRoRo() {
        RoRo r = new RoRo(20, 30, 4.4f, "DK", 120);
        boolean loadWentWell = r.loadingCargo(new RoRoCargo(3, 2));
        assertTrue(loadWentWell);
    }

    @Test
    void cantOverFill() {
        RoRo r = new RoRo(20, 30, 4.4f, "DK", 120);
        boolean loadWentWell = r.loadingCargo(new RoRoCargo(10, 5));
        assertFalse(loadWentWell);
    }

    @Test
    void computeFractionOfLaneSpaceUsed() {
        RoRo r = new RoRo(20, 30, 4.4f, "DK", 300);
        r.loadingCargo(new RoRoCargo(9, 3));
        assertEquals(0.54, r.utilityLevelOfCapacity(), 0.001);
    }
}