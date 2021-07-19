package lesson2;

import java.util.Scanner;

/**
 * Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 **/
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("В данном наборе 3 положительных числа.");
        } else if ((a > 0 && b > 0) || (b > 0 && c > 0) || (a > 0 && c > 0)) {
            System.out.println("В данном наборе 2 положительных числа.");
        } else if (a > 0 || b > 0 || c > 0) {
            System.out.println("В данном наборе 1 положительное число.");
        } else System.out.println("В данном наборе нету положительных чисел.");
    }
}
