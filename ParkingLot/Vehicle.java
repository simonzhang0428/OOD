package ParkingLot;

public abstract class Vehicle {
    
    public enum VehicleSize {
        COMPACT, LARGE
    }

    public abstract VehicleSize getSize();
}
