package Lesson7.human.jackets;

public class VersaceJacket implements IJacket {
    private int price;

    public VersaceJacket(int price) {
        this.price = price;
    }
    public VersaceJacket(){}

    @Override
    public void putOn() {
        System.out.println("Одел куртку Versace");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Versace");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
