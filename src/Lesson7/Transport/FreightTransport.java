package Lesson7.Transport;

public class FreightTransport extends LandTransport {
    private int liftingCapacity;
    private double powerKilowatts = power * 0.74;

    public FreightTransport(int power, int maxSpeed, int weight, String brand,int numberOfWheels,double fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, brand,numberOfWheels,fuelConsumption);
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
