package com.zadziarnouski.Lesson7.task26;

public class VacuumCleaner extends Appliances {
    private int power;
    private String color;
    private double weight;
    private boolean isPlugged = false;
    private boolean isWorks = false;

    public VacuumCleaner(String brand, String category, int price, int power, String color, double weight) {
        super(brand, category, price);
        this.power = power;
        this.color = color;
        this.weight = weight;
    }

    public VacuumCleaner() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void plugIn() {
        if (isPlugged == false) {
            isPlugged = true;
            System.out.println("Vacuum Cleaner is plugged.");
        } else System.out.println("Vacuum Cleaner already plugged.");
    }

    public void unplug() {
        if (isPlugged == true) {
            isPlugged = false;
            System.out.println("Vacuum Cleaner was unplug.");
        } else System.out.println("Are you okey?");
    }

    public void clean() {
        if ( isPlugged == true) {
            System.out.println("Cleaning completed.");
        } else System.out.println("Vacuum Cleaner is NOT plugged");
    }

    @Override
    public void turnOn() {
        if(isStatus() == false){
            if (isPlugged == true) {
                System.out.println("Zhzhzhzh");
                setStatus(true);
            } else {
                System.out.println("Vacuum cleaner not plugged in or battery is dead.");
            }
        }
            else System.out.println("The vacuum cleaner is already on");
    }

    @Override
    public void turnOff() {
        if (isStatus() == true) {
            System.out.println("The vacuum cleaner was turned off.");
        } else System.out.println("The vacuum cleaner already turned off.");
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "power=" + power +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", isPlugged=" + isPlugged +
                ", isWorks=" + isWorks +
                '}';
    }
}

