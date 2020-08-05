package com.zadziarnouski.Lesson7.task26;

public abstract class Appliances {
    private String brand;
    private String category;
    private int price;
    private boolean status = false;

    public Appliances(String brand, String category, int price) {
        this.brand = brand;
        this.category = category;
        this.price = price;
    }

    public Appliances() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return "Appliances{" +
                "brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
