package by.zadziarnouski.Lesson2;

import java.util.Scanner;

/**
 * Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.
 **/
public class Lesson2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= 0 && b >= 0 && c >= 0) {
            System.out.println("В данном наборе все числа положительные.");
        } else if (a < 0 && b < 0 && c < 0) {
            System.out.println("В данном наборе все числа отрицательные.");
        } else if ((a > 0 && b > 0) || (b > 0 && c > 0) || (a > 0 && c > 0)) {
            System.out.println("В данном наборе 2 положительных числа и 1 отрицательное.");
        } else if ((a < 0 && b < 0) || (b < 0 && c < 0) || (a < 0 && c < 0)) {
            System.out.println("В данном наборе 1 положительное число и 2 отрицательных.");
        }
    }
}
