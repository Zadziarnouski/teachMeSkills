package Lesson3;

import java.util.Random;

/**
 * Задание 13
 * Создать последовательность случайных чисел, найти и вывести наибольшее
 * из них.
 **/

public class Lesson3_15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) maxIndex = i;
        }
        System.out.println(array[maxIndex]);
    }
}

