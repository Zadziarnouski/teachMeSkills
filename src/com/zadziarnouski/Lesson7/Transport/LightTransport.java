package com.zadziarnouski.Lesson7.Transport;

public class LightTransport extends LandTransport {
    private String carBodyType;
    private int numberOfPassengers;
    private double powerKilowatts = power * 0.74;
    private int distance;

    public LightTransport(int power, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption, String carBodyType, int numberOfPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels,fuelConsumption);
        this.carBodyType = carBodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void letsGo(int time) {
        distance = maxSpeed * time;
        System.out.println("За время " + time + " ч., автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed + " км/ч проедет " + distance + " км и израсходует " + calulationOfFuelConsumption(time) + " литров топлива.");

    }

    private double calulationOfFuelConsumption(int time) {
        return (7.2 * distance) / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " , Car body type: " + carBodyType + " , Number of passengers: " + numberOfPassengers + " , Power(kilowatts): " + powerKilowatts;
    }
}
