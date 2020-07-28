package com.zadziarnouski.Lesson7.human.pants;

public class VersacePants implements IPants{
    private int price;

    public VersacePants(int price) {
        this.price = price;
    }

    public VersacePants() {
    }

    @Override
    public void putOn() {
        System.out.println("Одел штаны Versace");
    }

    @Override
    public void takeOff() {
        System.out.println("Cнял штаны Versace");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
