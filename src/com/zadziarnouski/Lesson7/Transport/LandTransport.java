package com.zadziarnouski.Lesson7.Transport;

public class LandTransport extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    LandTransport(int numberOfWheels, double fuelConsumption) {
        super(400, 250, 2275, "BMW X5 M50d");
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + " , Number of wheels: " + numberOfWheels + " , Fuel consumption: " + fuelConsumption;
    }
}
