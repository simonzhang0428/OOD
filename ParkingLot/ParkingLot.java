package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private static ParkingLot _instance = null;

    private List<Level> levels;
    private double hourlyRate;

    private ParkingLot() {
        levels = new ArrayList<>();
    }

    // Singletion, only one instance + thread safe / inefficient
    public static synchronized ParkingLot getInstance() {
        if (_instance == null) {
            _instance = new ParkingLot();
        }
        return _instance;
    }

    /*
    // static inner class, best thread safe way
    private ParkingLot(){}
    private static class LazyParkingLot {
        static final ParkingLot _instance = new ParkingLot();
    }
    public static ParkingLot getInstance() {
        return LazyParkingLot._instance;
    }
    */
    
    public int getAvailableCount() {
        // TODO
        return 0;
    }

    private List<Spot> findSpotsForVehicle(Vehicle v) {
        return null;
    }

    // not return boolean, instead throw exception for debug
    public Ticket parkVehicle(Vehicle v) {
        return new Ticket();
    }

    public void clearSpot(Ticket t) {

    }

    private double calculatePrice(Ticket t) {
        return 0.0;
    }
}