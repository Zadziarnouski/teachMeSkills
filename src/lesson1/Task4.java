package lesson1;

import java.util.Scanner;

/*Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.*/

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int countOfThousand = number / 1000;
        int countOfHundred = (number - countOfThousand * 1000) / 100;
        int countOfTen = (number - (countOfThousand * 1000 + countOfHundred * 100)) / 10;
        int countOfOne = number - (countOfThousand * 1000 + countOfHundred * 100 + countOfTen * 10);
        System.out.println(countOfOne * 1000 + countOfTen * 100 + countOfHundred * 10 + countOfThousand);
    }
}
