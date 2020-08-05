package com.zadziarnouski.Lesson6;

public class ATM {
    private int countsOf20Bills;
    private int countsOf50Bills;
    private int countsOf100Bills;
    private boolean resolution;

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

    public boolean withdrawMoney(int amountOfMoney) {

        int issuedMoney = 0;
        int changes20 = 0;
        int changes50 = 0;
        int changes100 = 0;

        Outer:
        if (amountOfMoney <= this.countsOf20Bills * 20 + this.countsOf50Bills * 50 + this.countsOf100Bills * 100) {
            for (int i = 0; i <= countsOf100Bills; i++) {
                for (int j = 0; j <= countsOf50Bills; j++) {
                    for (int k = 0; k <= countsOf20Bills; k++) {
                        if (amountOfMoney == k * 20 + j * 50 + i * 100) {
                            resolution = true;
                            break Outer;
                        }
                    }
                }
            }
        }

        if (resolution == true) {
            if (this.countsOf100Bills != 0) {
                if (amountOfMoney / 100 >= this.countsOf100Bills) {
                    issuedMoney += countsOf100Bills * 100;
                    countsOf100Bills = 0;
                } else {

                    changes100 = amountOfMoney / 100;     //int changes - кол-во снятых купюр.
                    this.countsOf100Bills -= changes100;
                    issuedMoney += changes100 * 100;
                }
            }
            if (this.countsOf50Bills != 0) {
                if ((amountOfMoney - issuedMoney) / 50 >= this.countsOf50Bills) {
                    issuedMoney += countsOf50Bills * 50;
                    countsOf50Bills = 0;
                } else if (amountOfMoney - issuedMoney >= 50) {
                    changes50 = (amountOfMoney - issuedMoney) / 50;
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
            System.out.println("From the ATM withdrawn " + issuedMoney + "$");
            return true;
        }

        System.out.println("This amount cannot be issued!");
        return false;

    }

    @Override
    public String toString() {
        return String.format("Inside the ATM : 20$ - %d piece(s), 50$ - %d piece(s), 100$ - %d piece(s)", countsOf20Bills, countsOf50Bills, countsOf100Bills);
    }
}

