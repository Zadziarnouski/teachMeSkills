package Lesson12;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задание 34
Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.
*/
public class Task34 {
    public static void main(String[] args) {
        String str = null;
        List<Integer> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("text2.txt"))) {
            while ((str = br.readLine()) != null) {
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(str);
                while (m.find()) {
                    int i = Integer.parseInt(m.group());
                    list.add(i);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }

        int summ = 0;
        for (int x : list) {
            summ += x;
            System.out.print(x + "\t");
        }

        System.out.println();

        System.out.println("Сумма чисел равна: " + summ);
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list);
        for (int i : set) {
            System.out.print(i + "\t");
        }
    }
}