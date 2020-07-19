/*
 * Задание 22
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
 * записаных по правилам Java, с помощью регулярных выражений и вывести их на
 * страницу.
 */

package com.zadziarnouski.Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    public static void main(String[] args) {
        String str = "123452423424 24 2422 3423424 2 24234  2342342342342342424242 1212121213123131 125345 12121212121e11e1e121e1 3123131313122222 ffsfsdfsf";
        Pattern regexp = Pattern.compile("[0-9]{16}");
        Matcher m = regexp.matcher(str);
        while (m.find()) {
            System.out.print(str.substring(m.start(), m.end()) + "\t");
        }
    }
}
