package parking;

import vehicle.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private int size;
    private Map<String, Integer> map;

    public ParkingLot(int size) {
        this.size = size;
        this.map = new HashMap<>();
    }

    public int getSize() {
        return size;
    }

    public void addSize(int size) {
        this.size += size;
    }

    public boolean canWeAccomodate(VehicleType vehicleType) {
        return this.size >= vehicleType.getSize();
    }

    public void accomodate(VehicleType vehicleType) {
        this.size -= size;
        map.put(vehicleType.getId(), vehicleType.getSize());
    }

    public void deAccomodate(VehicleType vehicleType) {
        this.size += size;
        map.remove(vehicleType.getId());
    }
}
