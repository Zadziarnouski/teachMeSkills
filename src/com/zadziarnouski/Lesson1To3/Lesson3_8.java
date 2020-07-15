package com.zadziarnouski.Lesson1To3;

import java.util.Random;

/**
 * Задание 6
 * Создайте число. Определите, является ли число трехзначным. Определите, является
 * ли его последняя цифра семеркой. Определите, является ли число четным.
 **/

public class Lesson3_8 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000);
        System.out.println("Сгенерированное число: " + number);
        String a = Integer.toString(number);
        if (a.length() == 3) {
            System.out.println("Это число является трёхзначным.");
        }
        if ((a.charAt(a.length() - 1)) == '7') {
            System.out.println("Последняя цифра данного числа 7.");
        }
        if (number % 2 == 0) {
            System.out.println("Это число является чётным.");
        }

    }
}
