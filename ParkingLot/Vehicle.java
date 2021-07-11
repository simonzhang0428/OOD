package ParkingLot;

public enum VehicleSize {
    Compact, Large
}
public abstract class Vehicle {
    public abstract VehicleSize getSize();
}
