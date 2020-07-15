package com.zadziarnouski.Lesson1To3;

import java.util.Scanner;

/**
 * 4)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 **/

public class Lesson3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;
        sc.close();
        for (int i = 0; i < b; i++) {
            total += a;
        }
        System.out.println("Произведение двух чисел " + a + "*" + b + " = " + total + ".");
    }
}
