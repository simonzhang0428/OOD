package ParkingLot;

import java.util.List;

public abstract class Vehicle {

    protected int size;
    protected List<Spot> spots;

    public int getSize() {
        return size;
    }
    
}
