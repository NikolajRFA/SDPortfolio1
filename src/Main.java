import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create ArrayList of Vessel and populate.
        ArrayList<Vessel> vessels = new ArrayList<>(List.of(
                new Container(20, 10, 2.5f, "DK", 60),
                new Tanker(20, 10, 2.5f, "DK", 2),
                new RoRo(30, 10, 2.5f, "DK", 200)
        ));

        // Create ArrayList of Cargo and populate with matching indexes.
        ArrayList<Cargo> cargo = new ArrayList<>(List.of(
                new ContainerCargo(20),
                new TankerCargo(0, 10),
                new RoRoCargo(4, 3)
        ));

        // Iterate over the Vessel ArrayList, using the loadingCargo method on the vessels with Cargo from the Cargo ArrayList.
        for (int i = 0; i < vessels.size(); i++) {
            Vessel tempVessel = vessels.get(i);
            Cargo tempCargo = cargo.get(i);
            if (tempVessel.loadingCargo(tempCargo)) {
                System.out.println("Loading " + tempCargo.getClass().getName() + " on to " + tempVessel.getClass().getName() + " vessel went well.");
            } else {
                System.out.println("Loading " + tempCargo.getClass().getName() + " on to " + tempVessel.getClass().getName() + " vessel went bad.");
            }
        }
    }
}