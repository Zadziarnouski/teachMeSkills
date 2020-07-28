package com.zadziarnouski.Lesson7.human.jackets;

public class ColumbiaJacket implements IJacket {
    private int price;

    public ColumbiaJacket(int price) {
        this.price = price;
    }
    public ColumbiaJacket(){}

    @Override
    public void putOn() {
        System.out.println("Одел куртку Columbia");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Columbia");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
