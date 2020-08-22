package Lesson7.Cards;

public class ClassicCard extends BankAccount {
    //Банковский счёт + возможность оплаты покупок на месте.
    public ClassicCard(String nameOfBank, String name, double sum) {
        super(nameOfBank, name, sum);
    }

    public double payForYourPurchase(double price) {
        if (price <= getSum()) {
            setSum(getSum() - price);
            System.out.println("Payment was successful. Account balance = " + getSum());
            return getSum();
        } else System.out.println("You do not have enough money to do this operation.");
        return getSum();
    }

    @Override
    public String toString() {
        return " Your Classic card {" +
                "Name of Bank = '" + getNameOfBank() + '\'' +
                ", balance = " + getSum() +
                '}';
    }
}

