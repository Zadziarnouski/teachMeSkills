package Lesson7.human.jackets;



public class NikeJacket implements IJacket {
    private int price;

    public NikeJacket(int price) {
        this.price = price;
    }
    public NikeJacket(){}

    @Override
    public void putOn() {
        System.out.println("Одел куртку Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Nike");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
