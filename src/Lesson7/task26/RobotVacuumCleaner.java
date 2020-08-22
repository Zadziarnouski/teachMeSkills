package Lesson7.task26;

public class RobotVacuumCleaner extends BatteryVacuumCleaner {
    private boolean remoteControl;

    public RobotVacuumCleaner(String brand, String category, int price, int power, String color, double weight, boolean hasBattery, int batteryCapacity, int batteryLife, boolean remoteControl){
        super(brand, category, price, power, color, weight, hasBattery, batteryCapacity, batteryLife);
        this.remoteControl = remoteControl;
    }

    public RobotVacuumCleaner(){}

    public boolean isRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(boolean remoteControl) {
        this.remoteControl = remoteControl;
    }

    public void clean(String place) {
        if(batteryIsCharged == true){
            System.out.println(place + " was cleaned.");
        }
        else System.out.println("The battery is dead.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", remoteControl=" + remoteControl +
                '}';
    }
}
