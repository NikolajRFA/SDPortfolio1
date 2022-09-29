import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SystemExtensionTest {
    @Test
    void getCoordinates() {
        Container c = new Container(35, 10, 0.4f, "DK", 100);
        c.sailTo("N55.104.132 E11.232.414");
        assertEquals("N55.104.132 E11.232.414", c.getCoordinates());
    }

    @Test
    void findSuitableVessel() {
        Vessel[] vessels = {new Container(35, 10, 0.4f, "DK", 100), new Container(35, 10, 0.4f, "DK", 50)};
        assertEquals(vessels[0], Vessel.findSuitableVessel(vessels, "container", 75));
    }
}
