package Lesson7.human.pants;

public class NikePants implements IPants {
    private int price;

    public NikePants(int price) {
        this.price = price;
    }

    public NikePants() {
    }

    @Override
    public void putOn() {
        System.out.println("Одел штаны Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Cнял штаны Nike");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
