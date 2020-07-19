/*
 * Задание 23
 * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
 * которых есть параметры, например <p id=”p1”>, и замени их на простые теги
 * абзацев <p>.
 */
package com.zadziarnouski.Lesson4;

public class Task23 {
    public static void main(String[] args) {
        String str = "<p>Это первый абзац.</p><p>Это второй абзац.</p> <p id=\"p1\"> Это третий абзац.</p> <p id=\"p1\"> Ну и это последний абзац.</p>";
        String strNew = str.replaceAll(".<p id=\\\"[a-zA-Z0-9]+\\\">.", "<p>");
        System.out.println(strNew);
    }
}
