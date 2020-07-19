/*
 * Задание 18
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 * общее их количество.
 */

package com.zadziarnouski.Lesson4;

public class Task18 {
    public static void main(String[] args) {
        String str = "Стро;ковый литерал — это последова:тель-ность символов, закл+юченных в двойные кавычки.";
        int counter = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '—' || symbol == ',' || symbol == '.' || symbol == '-' || symbol == ':' || symbol == ';' || symbol == '+') {
                counter++;
            }
        }
        System.out.println(String.format("В этом предложении %d знаков припинания или др.символов", counter));
    }
}