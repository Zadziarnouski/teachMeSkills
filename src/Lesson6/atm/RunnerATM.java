package Lesson6.atm;

public class RunnerATM {
    public static void main(String[] args) {
        ATM atm1 = new ATM(100, 100, 100);

        System.out.println(atm1);


        atm1.withdrawMoney(250);

        System.out.println(atm1);

    }
}
