package Lesson1;

import java.util.Scanner;

public class Lesson1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first = number / 1000;
        int second = (number - (first * 1000)) / 100;
        int third = (number - (first * 1000 + second * 100)) / 10;
        int fourth = number - (first * 1000 + second * 100 + third * 10);
        if (first == second | first == third | first == fourth | second == third | second == fourth | third == fourth) {
            System.out.println("Неверно!");
        } else
            System.out.println("Верно!");
    }
}
