package lesson10.additionalTasks.task4;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String brand;
    private double speed;
    private int price;

    public Car(String brand, double speed, int price){
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
    public Car(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.speed, speed) == 0 &&
                price == car.price &&
                Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, speed, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
