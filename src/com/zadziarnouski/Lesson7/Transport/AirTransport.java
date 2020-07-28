package com.zadziarnouski.Lesson7.Transport;

public class AirTransport extends Transport {
    private int wingspan;
    private int minimumRunwayLengthForTakeOff;

    AirTransport(int wingspan, int minimumRunwayLengthForTakeOff) {
        super(90000, 965, 135870, "Boeing");
        this.wingspan = wingspan;
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
    }

    @Override
    public String toString() {
        return super.toString() + ", Wingspan: " + wingspan + " , Minimum runway length for take off: " + minimumRunwayLengthForTakeOff;
    }
}
