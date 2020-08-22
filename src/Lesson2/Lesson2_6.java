package Lesson2;

import java.util.Scanner;
/**
 * Даны 2 числа. Вывести большее из них.
 **/
public class Lesson2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        } else System.out.println(b);
    }
}
