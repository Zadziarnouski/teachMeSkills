/*Задание 25
Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.*/

package Lesson6.atm;

public class ATM {
    private int countsOf20Bills;
    private int countsOf50Bills;
    private int countsOf100Bills;

    ATM(int countsOf20Bills, int countsOf50Bills, int countsOf100Bills) {
        this.countsOf20Bills = countsOf20Bills;
        this.countsOf50Bills = countsOf50Bills;
        this.countsOf100Bills = countsOf100Bills;
    }

    public int getCountsOf20Bills() {
        return countsOf20Bills;
    }

    public void setCountsOf20Bills(int countsOf20Bills) {
        this.countsOf20Bills = countsOf20Bills;
    }

    public int getCountsOf50Bills() {
        return countsOf50Bills;
    }

    public void setCountsOf50Bills(int countsOf50Bills) {
        this.countsOf50Bills = countsOf50Bills;
    }

    public int getCountsOf100Bills() {
        return countsOf100Bills;
    }

    public void setCountsOf100Bills(int countsOf100Bills) {
        this.countsOf100Bills = countsOf100Bills;
    }

    public void addBills(int... bills) {
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 20) {
                countsOf20Bills++;
            } else if (bills[i] == 50) {
                countsOf50Bills++;
            } else if (bills[i] == 100) {
                countsOf100Bills++;
            } else {
                System.out.println("Банкомат данную купюру не поддрерживает: " + bills[i]);
            }
        }
    }

    public boolean withdrawMoney(int amountOfMoney) {

        for (int i = 0; i <= countsOf100Bills; i++) {
            for (int j = 0; j <= countsOf50Bills; j++) {
                for (int k = 0; k <= countsOf20Bills; k++) {
                    if (amountOfMoney == 20 * k + 50 * j + 100 * i) {
                        int issuedMoney = 0;
                        int changes20 = 0;
                        int changes50 = 0;
                        int changes100 = 0;


                        if (this.countsOf100Bills != 0) {
                            if (amountOfMoney / 100 >= this.countsOf100Bills) {
                                issuedMoney += countsOf100Bills * 100;
                                changes100 = issuedMoney/100;
                                countsOf100Bills = 0;
                            } else {
                                changes100 = amountOfMoney / 100;
                                this.countsOf100Bills -= changes100;     //int changes - кол-во снятых купюр.
                                issuedMoney += changes100 * 100;
                            }
                        }
                        if (this.countsOf50Bills != 0) {
                            if ((amountOfMoney - issuedMoney) / 50 >= this.countsOf50Bills) {
                                issuedMoney += countsOf50Bills * 50;
                                changes50 = (issuedMoney - changes100*100)/50;
                                countsOf50Bills = 0;
                            } else if (amountOfMoney - issuedMoney >= 50) {
                                changes50 =(amountOfMoney - issuedMoney) / 50;
                                this.countsOf50Bills -= changes50;
                                issuedMoney += changes50 * 50;
                            }
                            if (this.countsOf20Bills != 0) {
                                if ((amountOfMoney - issuedMoney) / 20 >= this.countsOf20Bills) {
                                    issuedMoney += countsOf20Bills * 20;
                                    changes20 = issuedMoney/20;
                                    countsOf20Bills = 0;
                                } else {
                                    changes20 = (amountOfMoney - issuedMoney) / 20;
                                    this.countsOf20Bills -= changes20;
                                    issuedMoney += changes20 * 20;
                                }

                            }
                            System.out.println(String.format("From the ATM withdrawn 20$: %d piece(s), 50$: %d piece(s), 100$: %d piece(s).", changes20, changes50, changes100));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return String.format("Inside the ATM : 20$ - %d piece(s), 50$ - %d piece(s), 100$ - %d piece(s)", countsOf20Bills, countsOf50Bills, countsOf100Bills);
    }
}
