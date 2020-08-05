package com.zadziarnouski.Lesson7.Cards;

public class BankAccount {
    private String nameOfBank;
    private String name;
    private double sum;

    //Банковский аккаунт.
    public BankAccount(String nameOfBank, String name, double sum) {
        this.nameOfBank = nameOfBank;
        this.name = name;
        this.sum = sum;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double withdrawMoneyFromAccount(double money) {
        if (money <= this.sum) {
            System.out.println("Your balance after removal " + money + " is " + (sum - money));
            return sum -= money;
        } else {
            System.out.println("You do not have enough money to do this operation.");
            return sum;
        }
    }

    public double putMoneyIntoAccount(double money) {
        System.out.println("Deposit amount: " + money + ". Your balance now: " + (sum += money));
        return sum;
    }


    @Override
    public String toString() {
        return "Your bank account {" +
                "Name of Bank = '" + nameOfBank + '\'' +
                ", balance = " + sum +
                '}';
    }
}
