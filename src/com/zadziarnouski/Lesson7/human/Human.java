package com.zadziarnouski.Lesson7.human;

import com.zadziarnouski.Lesson7.human.jackets.IJacket;
import com.zadziarnouski.Lesson7.human.pants.IPants;
import com.zadziarnouski.Lesson7.human.shoes.IShoes;

public class Human implements IHuman {
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(IJacket jacket, IPants pants, IShoes shoes){
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }
    public Human(){}

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

    @Override
    public int getPrice() {
        int price = jacket.getPrice() + pants.getPrice() + shoes.getPrice();
        return price;
    }
}
