package Lesson7.Transport;

public class MilitaryTransport extends AirTransport {
    private int numberOfMissiles;
    private boolean hasEjectionSystem;
    private double powerKilowatts = power * 0.74;

    public MilitaryTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeOff, int numberOfMissiles, boolean hasEjectionSystem) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeOff);
        this.numberOfMissiles = numberOfMissiles;
        this.hasEjectionSystem = hasEjectionSystem;
    }

    public void shoot() {
        if (numberOfMissiles > 0) System.out.println("Piuuu");
        else System.out.println("No ammunition");
        numberOfMissiles--;
    }

    public void bailout() {
        if (hasEjectionSystem == true) System.out.println("Bailout was successful");
        else System.out.println("What is \"bailout\"?");
    }

    @Override
    public String toString() {
        return super.toString() + " , Number of missiles: " + numberOfMissiles + " , Ejection System: " + hasEjectionSystem + " , Power(kilowatts): " + powerKilowatts;
    }
}
