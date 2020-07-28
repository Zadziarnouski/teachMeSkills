package com.zadziarnouski.Lesson7.human.shoes;

public class ColumbiaShoes implements IShoes {
    private int price;

    public ColumbiaShoes(int price){ this.price = price;}
    public ColumbiaShoes(){}

    @Override
    public void putOn() {
        System.out.println("Обул Columbia");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Columbia");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
