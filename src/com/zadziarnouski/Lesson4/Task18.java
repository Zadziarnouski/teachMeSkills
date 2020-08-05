/*
 * Задание 18
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 * общее их количество.
 */

package com.zadziarnouski.Lesson4;

public class Task18 {
    public static void main(String[] args) {
        String str = "Стро;ковый литерал — это п!осл_едова:тель-ность символов, закл+юченных в двойные кавычки.";
        int counter = 0;
        for (String string : str.split("\\p{Punct}")) {
            counter++;
        }
        System.out.println(String.format("В данной строке %d знаков припинания.", counter));


    }
}