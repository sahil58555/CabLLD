package parking;

import parking.ParkingLot;
import vehicle.VehicleType;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ParkingManager {
    private static ParkingLot parkingLot;
    private static Map<String, Ticket> map;
    private static ParkingManager parkingManager;

    private ParkingManager() {
    }

    public static ParkingManager getParkingManager(int size) {
        if(parkingManager == null) {
            parkingManager = new ParkingManager();
            parkingLot = new ParkingLot(size);
            map = new HashMap<>();
        }

        return parkingManager;
    }

    public void entry(VehicleType vehicleType) {

        if(!parkingLot.canWeAccomodate(vehicleType)) {
            System.out.println("Size is full. Pls inc the size");
            throw new RuntimeException();
        }

        Ticket ticket = new Ticket(LocalDate.now());
        map.put(vehicleType.getId(), ticket);
        parkingLot.accomodate(vehicleType);
    }

    public void exit(VehicleType vehicleType) {
        map.get(vehicleType.getId()).setEndTime(LocalDate.now());
        parkingLot.deAccomodate(vehicleType);
    }

    public long getPayment(VehicleType vehicleType) {

        return 100;
    }
}
