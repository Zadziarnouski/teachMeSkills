/*
 * Задание 21
 * Напишите три цикла выполняющих многократное сложение строк, один с
 * помощью оператора сложения и String, другой с помощью StringBuilder и метода
 * append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */
package com.zadziarnouski.Lesson4;

import java.util.GregorianCalendar;

public class Task21 {
    public static void main(String[] args) {
        String str = "Это строка";
        GregorianCalendar startString = new GregorianCalendar();
        for (int i = 0; i < 10000; i++) {
            str += " ещё одну строку";
        }
        GregorianCalendar endString = new GregorianCalendar();

        //StringBuilder
        StringBuilder sBuilder = new StringBuilder("Строка в Билдере");
        GregorianCalendar startBuilder = new GregorianCalendar();
        for (int i = 0; i < 10000; i++) {
            sBuilder.append("ещё одна строка");
        }
        GregorianCalendar endBuilder = new GregorianCalendar();

        //StringBuffer
        StringBuffer sBuffer = new StringBuffer("Строка в Бафере");
        GregorianCalendar startBuffer = new GregorianCalendar();
        for (int i = 0; i < 10000; i++) {
            sBuffer.append("ещё одна строка");
        }
        GregorianCalendar endBuffer = new GregorianCalendar();

        System.out.println("Время затраченное на сложение строк в классе String в миллисекундах: " + (endString.getTimeInMillis() - startString.getTimeInMillis()));
        System.out.println("Время затраченное на сложение строк в классе StringBuilder в миллисекундах: " + (endBuilder.getTimeInMillis() - startBuilder.getTimeInMillis()));
        System.out.println("Время затраченное на сложение строк в классе StringBuffer в миллисекундах: " + (endBuffer.getTimeInMillis() - startBuffer.getTimeInMillis()));
    }
}