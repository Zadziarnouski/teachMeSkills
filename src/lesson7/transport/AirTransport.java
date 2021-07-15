package lesson7.Transport;

public class AirTransport extends Transport {
    private int wingspan;
    private int minimumRunwayLengthForTakeOff;

    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeOff) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
    }

    @Override
    public String toString() {
        return super.toString() + ", Wingspan: " + wingspan + " , Minimum runway length for take off: " + minimumRunwayLengthForTakeOff;
    }
}
