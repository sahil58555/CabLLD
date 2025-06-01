package vehicle;

import vehicle.VehicleType;

public class Motor extends VehicleType {

    private final int size;
    private String id;

    public String getId() {
        return id;
    }

    public Motor(int size, String id) {
        this.size = size;
        this.id = id;
    }
    @Override
    public int getSize() {
        return size;
    }
}
