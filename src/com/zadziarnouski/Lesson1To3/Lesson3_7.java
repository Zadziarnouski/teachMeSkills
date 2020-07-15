package com.zadziarnouski.Lesson1To3;

/**
 * 7)Напишите программу, определяющую сумму всех нечетных чисел от 1до 99
 **/

public class Lesson3_7 {
    public static void main(String[] args) {
        int summ = 0;
        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) summ += i;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99: " + summ);
    }
}
