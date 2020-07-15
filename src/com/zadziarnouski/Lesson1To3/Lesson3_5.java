package com.zadziarnouski.Lesson1To3;

import java.util.Scanner;

/**
 * 5)Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 **/
public class Lesson3_5 {
    public static void main(String[] args) {
        System.out.println("Введите пожалуйста количество дюймов(от 1 дюйма до 20 дюймов), которое вы хотите перевести в сантиметры!");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number < 1 || number > 20) {
            System.out.println("Повторите попытку! Ваше значение: + " + number + " не входит в предел от 1 до 20 дюймов.");
            number = sc.nextInt();
        }
        sc.close();
        double fromСentimetersToInches = number * 2.54;
        System.out.println(number + " дюйм = " + fromСentimetersToInches + " см.");
    }
}
