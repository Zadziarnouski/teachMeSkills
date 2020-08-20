/*
 * Задание 19
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
 * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать.
 */

package Lesson4;

import java.util.StringTokenizer;

public class Task19 {
    public static void main(String[] args) {
        String str = "Та самая строка, над которой я буду эксперементировать. ";
        int counter = 0;
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken();
            counter++;
        }
        System.out.println(counter);
    }


}