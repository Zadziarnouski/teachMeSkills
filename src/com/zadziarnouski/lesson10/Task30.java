package com.zadziarnouski.lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Задание 30
Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.
*/
public class Task30 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(1);
        randomNumbers.add(1);
        randomNumbers.add(2);
        randomNumbers.add(2);
        randomNumbers.add(2);
        randomNumbers.add(3);
        randomNumbers.add(3);
        randomNumbers.add(3);

        for (Integer i : randomNumbers) {
            System.out.print(i + "\t");
        }

        System.out.println();

        Set<Integer> filtered = new HashSet<>();
        filtered.addAll(randomNumbers);

        randomNumbers.clear();
        randomNumbers.addAll(filtered);

        for (Integer i : randomNumbers) {
            System.out.print(i + "\t");
        }
    }
}
