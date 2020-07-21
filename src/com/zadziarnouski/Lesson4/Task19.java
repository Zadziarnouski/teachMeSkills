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
        String str = "Та самая строка, над которой я буду эксперементировать. ";
//        int counter = 0;
//        char symbolFirst, symbolSecond;
//        String strNew = str.trim();     //универсальный способ, метод trim() - коппирование всего содержимого и удаление всех внешних отступов.
//        if (str.charAt(0) != ' ') {        //поправка на первый символ
//            counter++;
//        }
//        for (int i = 0; i < strNew.length() - 1; i++) {
//            symbolFirst = strNew.charAt(i);
//            symbolSecond = strNew.charAt(i + 1);
//            if (symbolFirst == ' ' && symbolSecond != ' ') {  //основной подсчёт
//                counter++;
//            }
//        }
//        System.out.println(counter);
//    }
//}

//It's better to use StringTokenizer or Pattern - Matcher with regular expression
        int counter = 0;
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken();
            counter++;
        }
        System.out.println(counter);
    }


}