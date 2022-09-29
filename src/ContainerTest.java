import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {
    @Test
    void loadContainers() {
        Container c = new Container(20, 20, 5.5f, "DK", 100);
        boolean loadWentWell = c.loadingCargo(10);
        assertTrue(loadWentWell);
    }

    @Test
    void cantLoadTooManyContainers() {
        Container c = new Container(20, 20, 5.5f, "DK", 100);
        boolean loadWentWell = c.loadingCargo(101);
        assertFalse(loadWentWell);
    }

    @Test
    void computeFractionOfCargoSpaceUsed() {
        Container c = new Container(20, 20, 5.5f, "DK", 100);
        c.loadingCargo(35);
        assertEquals(0.35, c.utilityLevelOfCapacity(), 0.001);
    }
}