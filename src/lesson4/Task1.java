/*
 * Задание 18
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 * общее их количество.
 */

package lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[] args) {
        String str = "Строковый литерал - это последова:тель-ность символов, заключенных в двойные кавычки.";
        int counter = 0;
        String regex = "[\\p{Punct}]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            counter++;
        }
        System.out.println(String.format("В этом предложении %d знаков припинания или др.символов", counter));
    }
}