/*
 * Задание 19
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
 * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать.
 */

package com.zadziarnouski.Lesson4;

import java.util.StringTokenizer;

public class Task19 {
    public static void main(String[] args) {
        String str = "This string,for example,contains seven words.";
        int counter = 0;
        StringTokenizer tokenizer = new StringTokenizer(str," ,");
        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken();
            counter++;
        }
        System.out.println("В данном тексте " + counter + " слов.");
    }


}