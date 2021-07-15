package lesson7.Cards;

public class GoldCard extends ClassicCard {
    // Классическая карта + CashBack 5%
    public GoldCard(String nameOfBank, String name, double sum) {
        super(nameOfBank, name, sum);
    }

    @Override
    public double payForYourPurchase(double price) {
        if (price <= getSum()) {
            setSum(getSum() - price + price * 0.05);
            System.out.println("Payment was successful. Account balance = " + getSum());
            return getSum();
        } else System.out.println("You do not have enough money to do this operation.");
        return getSum();
    }

    @Override
    public String toString() {
        return " Your Gold card {" +
                "Name of Bank = '" + getNameOfBank() + '\'' +
                ", balance = " + getSum() +
                '}';
    }
}
