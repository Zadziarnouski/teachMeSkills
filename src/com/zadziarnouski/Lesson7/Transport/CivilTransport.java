package com.zadziarnouski.Lesson7.Transport;

public class CivilTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean hasBusinessClass;
    private double powerKilowatts = power * 0.74;

    CivilTransport(int numberOfPassengers, boolean hasBusinessClass) {
        super(61, 2000);
        this.numberOfPassengers = numberOfPassengers;
        this.hasBusinessClass = hasBusinessClass;
    }

    public void capacityOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers <= this.numberOfPassengers) System.out.println("Plane loaded");
        else System.out.println("There are not enough seats on the plane.");
    }

    @Override
    public String toString() {
        return super.toString() + " , Number of passengers: " + numberOfPassengers + " , Business class: " + hasBusinessClass + " , Power(kilowatts): " + powerKilowatts;
    }
}
