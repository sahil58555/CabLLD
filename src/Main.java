import parking.ParkingManager;
import vehicle.Car;
import vehicle.VehicleManager;
import vehicle.VehicleType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleManager vehicleManager = VehicleManager.getVehicleManger();
        String type = sc.nextLine();
        System.out.println("Type: " + type);
        int size = Integer.parseInt(sc.nextLine());
        System.out.println("Size " + size);

        String id = sc.nextLine();
        System.out.println("id " + id);

        VehicleType vehicleType = (VehicleType) vehicleManager.getVehicle(type, size, id);
        int parkingSize = Integer.parseInt(sc.nextLine());
        System.out.println("Parking Size " + parkingSize);
        ParkingManager parkingManager = ParkingManager.getParkingManager(parkingSize);

        parkingManager.entry(vehicleType);

        parkingManager.exit(vehicleType);
        long finalCost = parkingManager.getPayment(vehicleType);

        System.out.println(finalCost);
    }
}




