package vehicle;

public class VehicleManager {

    private static VehicleManager vehicleManager;

    private VehicleManager() {

    }
    public static VehicleManager getVehicleManger() {

        if(vehicleManager == null) {
            vehicleManager = new VehicleManager();
        }

        return vehicleManager;
    }
    public Object getVehicle(String type, int size, String id) {
        System.out.println("Debug " + type);
        return switch (type) {
            case "Car" -> new Car(size, id);
            case "Motor" -> new Motor(size, id);
            default -> new Exception("Vehicle not supported");
        };
    }

}
