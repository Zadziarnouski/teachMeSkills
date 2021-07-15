package lesson3;

import java.util.Random;

/**
 * Задание 8
 * Имеется целове число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в правильном падеже.
 **/

public class Lesson3_10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = Math.abs(rand.nextInt());
        if (x == 1) System.out.println(x + " рубль");
        else if (x >= 2 && x <= 4) System.out.println(x + " рубля");
        else System.out.println(x + " рублей");
    }
}
