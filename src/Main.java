public class Main {
    public static void main(String[] args) {
        Container container = new Container(20, 10, 2.5f, "DK", 60);
        if (container.loadingCargo(20)) {
            System.out.println("Container loading went well");
        } else {
            System.out.println("Not enough space for that many containers!");
        }
        System.out.println("Container ship is: " + container.utilityLevelOfCapacity() + " full.");

        System.out.println();

        Tanker tanker = new Tanker(20, 10, 2.5f, "DK", 2);
        if (tanker.loadingCargo(0, 10)) {
            System.out.println("Tanker loading went well.");
        } else {
            System.out.println("Tanker loading went wrong!");
        }
        System.out.println("Tanker is: " + tanker.utilityLevelOfCapacity() + " full.");

        System.out.println();

        RoRo roRo = new RoRo(30, 10, 2.5f, "DK", 200);
        if (roRo.loadingCargo(4, 3)) {
            System.out.println("RoRo loading went well.");
        } else {
            System.out.println("RoRo loading went wrong!");
        }
        System.out.println("RoRo has " + roRo.utilityLevelOfCapacity() + " meters filled.");
    }
}
