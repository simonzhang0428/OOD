package Enum;

public class TrafficSignalTest {

    public enum TrafficSignal {
        RED, GREEN, YELLOW
    }

    TrafficSignal signal;

    public TrafficSignalTest(TrafficSignal signal) {
        this.signal = signal;
    }
    
    public void tellItLikeItIs() {
        switch (signal) {
            case RED:
                System.out.println("Red! stop!!");
                break;

            case GREEN:
                System.out.println("Go ahead, it is Green!");
                break;

            default:
                System.out.println("watch out, it is dangerous, Yellow!");
                break;

        }
    }

    public static void main(String[] args) {
        TrafficSignalTest red = new TrafficSignalTest(TrafficSignal.RED);
        red.tellItLikeItIs();
        TrafficSignalTest green = new TrafficSignalTest(TrafficSignal.GREEN);
        green.tellItLikeItIs();
    }
}