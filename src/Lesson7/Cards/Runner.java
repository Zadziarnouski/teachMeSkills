package Lesson7.Cards;

public class Runner {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount("Leumi", "Pirozjkov Vasya", 10000);
        bA.putMoneyIntoAccount(200);
        bA.withdrawMoneyFromAccount(300);

        ClassicCard classic = new ClassicCard("Leumi", "Gribov Kolya", 5000);
        classic.payForYourPurchase(5500);
        classic.payForYourPurchase(300);

        GoldCard gold = new GoldCard("Leumi", "Zadziarnouski Taras", 10000000);
        gold.payForYourPurchase(100000);

    }
}
