package com.zadziarnouski.Lesson1To3;

/**
 * Задание 14
 * Создать массив оценок произвольной длины, вывести максимальную и
 * минимальную оценку, её (их) номера.
 **/

public class Lesson3_16 {
    public static void main(String[] args) {
        int[] assessments = {5, 3, 6, 7, 8, 6, 7, 8, 9, 4, 1, 2, 4, 5, 6};
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < assessments.length; i++) {
            if (assessments[minIndex] > assessments[i]) minIndex = i;
            if (assessments[maxIndex] < assessments[i]) maxIndex = i;
        }
        System.out.println("Минимальная оценка равна " + assessments[minIndex] + ", а её индекс равен " + minIndex);
        System.out.println("Макимальная оценка равна " + assessments[maxIndex] + ", а её индекс равен " + maxIndex);

    }
}
