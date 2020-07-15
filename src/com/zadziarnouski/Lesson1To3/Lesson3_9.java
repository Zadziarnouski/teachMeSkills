package com.zadziarnouski.Lesson1To3;

import java.util.Scanner;

/**
 * Задание 7
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 **/
public class Lesson3_9 {
    public static void main(String[] args) {

        int a = (int) (1 + Math.random() * 10);
        int b = (int) (1 + Math.random() * 10);
        System.out.print("Введите пожалуйста значение радиуса картонки: ");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        sc.close();
        int maxSide = 0;
        if ((a - b) > 0) {
            maxSide = a;
        } else maxSide = b;
        if ((radius) * 2 >= Math.sqrt(maxSide * maxSide + maxSide * maxSide)) {
            System.out.println("Картонка радиусом " + radius + " накроет отверстие размерами " + a + " x " + b + ".");
        } else
            System.out.println("Картонка радиусом " + radius + " НЕнакроет отверстие размерами " + a + " x " + b + ".");
    }
}
