package Lesson7.task26;

public class BatteryVacuumCleaner extends VacuumCleaner {
    private boolean hasBattery;
    private int batteryCapacity;
    private int batteryLife;
    protected boolean batteryIsCharged = false;

    public BatteryVacuumCleaner(String brand, String category, int price, int power, String color, double weight, boolean hasBattery, int batteryCapacity, int batteryLife) {
        super(brand, category, price, power, color, weight);
        this.hasBattery = hasBattery;
        this.batteryCapacity = batteryCapacity;
        this.batteryLife = batteryLife;
    }

    public BatteryVacuumCleaner() {
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }


    public void putOnCharge() {
        if (batteryIsCharged == false) {
            batteryIsCharged = true;
            System.out.println("Battery charged");
        } else System.out.println("Battery already charged");
    }

    public void clean() {
        if (batteryIsCharged == true) {
            for (int i = batteryLife; i >= 0; i--) {
                System.out.println(i);
            }
            setStatus(false);
            System.out.println("Cleaning completed.");
        } else System.out.println("The battery is dead");
    }

    @Override
    public void turnOn() {
        if (isStatus() == false){
            if (batteryIsCharged == true) {
                setStatus(true);
                System.out.println("Zjzjzjzj");
            } else System.out.println("Charge the battery!");
        }
            else System.out.println("The vacuum cleaner is already on.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", hasBattery=" + hasBattery +
                ", batteryCapacity=" + batteryCapacity +
                ", batteryLife=" + batteryLife +
                ", batteryIsCharged=" + batteryIsCharged +
                '}';
    }
}

