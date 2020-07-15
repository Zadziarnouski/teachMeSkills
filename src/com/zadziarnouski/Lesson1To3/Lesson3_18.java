package com.zadziarnouski.Lesson1To3;

/**
 * Задание 16
 * Определите сумму элементов одномерного массива, расположенных между
 * минимальным и максимальным значениями.
 **/

public class Lesson3_18 {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 6, 13, 32, 21, 12, 5, 17,};
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] > array[i]) minIndex = i;
            if (array[maxIndex] < array[i]) maxIndex = i;
        }
        int summ = 0;
        for (int i = minIndex; i <= maxIndex; i++) {
            summ += array[i];
        }
        System.out.println(summ);
    }
}