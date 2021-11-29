package dynamictypes;

import dynamictypes.publictransport.PublicVehicle;

public class Bus extends PublicVehicle {
    String brand;

    public Bus(int lineNumber, double length, String brand) {
        super(lineNumber, length);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
