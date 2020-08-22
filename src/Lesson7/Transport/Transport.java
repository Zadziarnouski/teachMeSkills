package Lesson7.Transport;

public class Transport {
    protected int power;
    protected int maxSpeed;
    protected int weight;
    protected String brand;
    protected double powerKilowatts = 0;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return " Power(horsepower): " + power + " , Maximum speed: " + maxSpeed + " , Weight: " + weight + " , Brand: " + brand;
    }
}
