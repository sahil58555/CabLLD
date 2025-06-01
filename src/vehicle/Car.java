package vehicle;

import vehicle.VehicleType;

public class Car extends VehicleType {

    private final int size;
    private String id;

    public String getId() {
        return id;
    }

    @Override
    public int getSize() {
        return size;
    }

    public Car(int size, String id) {
        this.size = size;
        this.id = id;
    }

}
