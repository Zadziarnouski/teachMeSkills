package com.zadziarnouski.Lesson1To3;

/**
 * 2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 **/


public class Lesson3_2 {
    public static void main(String[] args) {
        int countOfAmoeba = 1;
        int amoebas[] = new int[8];


        for (int i = 0; i < 8; i++) {
            countOfAmoeba *= 2;
            amoebas[i] = countOfAmoeba;
        }
        System.out.print("Количество амёб через 3,6,9,12,...,24 часа = ");
        for (int i = 0; i < amoebas.length; i++) {
            System.out.print(amoebas[i] + " шт \t");
        }
    }
}
