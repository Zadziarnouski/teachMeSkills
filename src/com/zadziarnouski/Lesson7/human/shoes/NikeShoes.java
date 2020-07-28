package com.zadziarnouski.Lesson7.human.shoes;

public class NikeShoes implements IShoes {
    private int price;

    public NikeShoes(int price){ this.price = price;}
    public NikeShoes(){}

    @Override
    public void putOn() {
        System.out.println("Обул Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Nike");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
