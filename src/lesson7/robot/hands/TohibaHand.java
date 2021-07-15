package lesson7.robot.hands;

public class TohibaHand implements IHand {
    private int price;

    public TohibaHand(int price) {
        this.price = price;
    }

    public TohibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднял руку Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
