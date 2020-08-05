package com.zadziarnouski.Lesson7.Transport;

public class LandTransport extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    public LandTransport(int power, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + " , Number of wheels: " + numberOfWheels + " , Fuel consumption: " + fuelConsumption;
    }
}
