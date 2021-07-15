package lesson2;

import java.util.Scanner;

public class Lesson2_1 {
    public static void main(String[] args) {
        System.out.println("Запишите ваше число, пожалуйста!");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (Math.abs(number / 10) < 1) {
            if (number >= 0) {
                System.out.println("Это однозначное положительное число.");
            } else System.out.println("Это однозначное отрицательное число.");
        } else if (Math.abs(number / 100) < 1) {
            if (number >= 0) {
                System.out.println("Это двухзначное положительное число.");
            } else System.out.println("Это двухзначное отрицательное число.");
        } else System.out.println("Это трехзначное и более число.");
    }
}
