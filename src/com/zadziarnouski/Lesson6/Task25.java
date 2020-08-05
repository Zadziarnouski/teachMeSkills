/*Задание 25
Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.*/

package com.zadziarnouski.Lesson6;

public class Task25 {
    public static void main(String[] args) {

        class ATM {
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

                int issuedMoney = 0;
                int changes20 = 0;
                int changes50 = 0;
                int changes100 = 0;
                if (amountOfMoney <= this.countsOf20Bills * 20 + this.countsOf50Bills * 50 + this.countsOf100Bills * 100 && (amountOfMoney % 50 == 0 || amountOfMoney % 50 % 20 == 0)) {

                    if (this.countsOf100Bills != 0) {
                        if (amountOfMoney / 100 >= this.countsOf100Bills) {
                            issuedMoney += countsOf100Bills * 100;
                            countsOf100Bills = 0;
                        } else {
                            changes100 = this.countsOf100Bills - amountOfMoney / 100;     //int changes - кол-во снятых купюр.
                            this.countsOf100Bills -= changes100;
                            issuedMoney += changes100 * 100;
                        }
                    }
                    if (this.countsOf50Bills != 0) {
                        if ((amountOfMoney - issuedMoney) / 50 >= this.countsOf50Bills) {
                            issuedMoney += countsOf50Bills * 50;
                            countsOf50Bills = 0;
                        } else if (amountOfMoney - issuedMoney > 50) {
                            changes50 = this.countsOf50Bills - (amountOfMoney - issuedMoney) / 50;
                            this.countsOf50Bills -= changes50;
                            issuedMoney += changes50 * 50;
                        } else ;
                    }
                    if (this.countsOf20Bills != 0) {
                        if ((amountOfMoney - issuedMoney) / 20 >= this.countsOf20Bills) {
                            issuedMoney += countsOf20Bills * 20;
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
                return false;
            }


            @Override
            public String toString() {
                return String.format("Inside the ATM : 20$ - %d piece(s), 50$ - %d piece(s), 100$ - %d piece(s)", countsOf20Bills, countsOf50Bills, countsOf100Bills);
            }
        }

        ATM atm1 = new ATM(2, 2, 2);

        System.out.println(atm1);
        System.out.println(atm1.withdrawMoney(290));
        System.out.println(atm1.withdrawMoney(340));
        System.out.println(atm1.withdrawMoney(360));
        System.out.println(atm1);

    }
}
