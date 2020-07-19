/*
 * Задание 20
 * Имеется строка с текстом. Вывести текст, составленный из последних букв
 * всех слов.
 */

package com.zadziarnouski.Lesson4;

public class Task20 {
    public static void main(String[] args) {
        String str = "Та самая строка, над которой я буду эксперементировать.";
        char symbolFirst, symbolSecond;
        for (int i = 0; i < str.length() - 1; i++) {
            symbolFirst = str.charAt(i);
            symbolSecond = str.charAt(i + 1);
            if (symbolFirst != ' ' && symbolSecond == ' ') {    //проверка условия, первый символ не равен 'отступ' и второй символ равен 'отступу'
                if (symbolFirst == ',' || symbolFirst == '.')                         //костыль, на случай если в тексте встретится ',' или '.'
                    symbolFirst = str.charAt(i - 1);
                System.out.print(symbolFirst);
            }
        }
        StringBuilder string = new StringBuilder("dfs");
    }
}
