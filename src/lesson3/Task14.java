package lesson3;

import java.util.Scanner;

/**
 * Задание 12
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 **/

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int summ = 0;
        int counter = 0;

        for (int i = 1; i < 1000000; i++) {
            if (i % 3 == 0) {
                summ += i;
                counter++;
            }
            if (counter == n) break;
        }
        System.out.println("Сумма первых n целых чисел, которые делятся на 3: " + summ);
    }
}
