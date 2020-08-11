package com.zadziarnouski.lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Задание 31
Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.
*/
public class task31 {
    public static void main(String[] args) {
        int appraisalsMax = 0;

        List<Integer> appraisals = new ArrayList<>();
        appraisals.add(1);
        appraisals.add(9);
        appraisals.add(8);
        appraisals.add(7);
        appraisals.add(6);
        appraisals.add(10);
        appraisals.add(4);
        appraisals.add(2);
        appraisals.add(3);
        appraisals.add(7);

//        for (Integer i : appraisals) {     //Одна из самых коротких записей
//            if (i > appraisalsMax) {
//                appraisalsMax = i;
//            }
//        }

        Iterator<Integer> iterator = appraisals.iterator();  // Это другой вариант
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i > appraisalsMax) {
                appraisalsMax = i;
            }
        }

        System.out.println(appraisalsMax);
    }
}
