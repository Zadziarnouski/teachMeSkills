package lesson7.human.pants;

public class ColumbiaPants implements IPants {
    private int price;

    public ColumbiaPants(int price) {
        this.price = price;
    }

    public ColumbiaPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Одел штаны Columbia");
    }

    @Override
    public void takeOff() {
        System.out.println("Cнял штаны Columbia");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
