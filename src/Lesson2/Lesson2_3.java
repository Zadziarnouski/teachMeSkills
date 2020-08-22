package Lesson2;

import java.util.Scanner;

/**
 * Дано целое число. Если оно является положительным, то прибавить к нему 1.
 * Если отрицательным, то вычесть из него 2.
 * Если нулевым, то заменить его на 10. Вывести полученное число.
 **/
public class Lesson2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println(number + 1);
        } else if (number < 0) {
            System.out.println(number - 2);
        } else System.out.println(10);
    }
}
