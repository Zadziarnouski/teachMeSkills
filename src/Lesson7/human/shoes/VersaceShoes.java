package Lesson7.human.shoes;

public class VersaceShoes implements IShoes{
    private int price;

    VersaceShoes(int price){ this.price = price;}
    VersaceShoes(){}

    @Override
    public void putOn() {
        System.out.println("Обул Versace");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Versace");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
