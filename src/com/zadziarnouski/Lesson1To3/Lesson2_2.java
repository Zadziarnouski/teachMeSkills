package com.zadziarnouski.Lesson1To3;

import java.util.Scanner;

/*Треугольник существует только тогда, когда сумма любых двух его сторонбольше третьей.
Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого
треугольника. Требуется сравнить длину каждогоотрезка-стороны с суммой двух других.
Если хотя бы в одном случае отрезококажется больше суммы двух других, то треугольника
 с такими сторонами несуществует.
 */
public class Lesson2_2 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пожалуйста значения 3-ёх сторон треугольника, после ввода каждой из сторон нажмите \"Enter\"");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= b + c && b <= a + c && c <= a + b) {
            System.out.println("Такой треугольник существует.");
        } else System.out.println("Такой треугольник не существует.");
    }
}
