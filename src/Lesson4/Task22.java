/*
 * Задание 22
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
 * записаных по правилам Java, с помощью регулярных выражений и вывести их на
 * страницу.
 */

package Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    public static void main(String[] args) {
        String str = "3245 21 -543 12 1B3 4E -435 8C32 3F  321 E1 4BW1 8999 B6 10101010";
        Pattern regexp = Pattern.compile(" [1-9A-F]{1,2} ");
        Matcher m = regexp.matcher(str);
        while (m.find()) {
            System.out.print(str.substring(m.start(), m.end()) + " ");
        }
    }
}


