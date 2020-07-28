package com.zadziarnouski.Lesson7.Transport;

public class FreightTransport extends LandTransport {
    private int liftingCapacity;
    private double powerKilowatts = power * 0.74;

    FreightTransport(int liftingCapacity) {
        super(4, 7.2);
        this.liftingCapacity = liftingCapacity;
    }

    public void loading(int weight) {
        if (weight <= this.liftingCapacity) System.out.println("Truck loaded.");
        else System.out.println("You need a bigger truck.");
    }

    @Override
    public String toString() {
        return super.toString() + " , Lifting capacity: " + liftingCapacity + " , Power(kilowatts): " + powerKilowatts;
    }
}
