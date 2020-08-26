package Lesson12.additionalTasks;

/*3) Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int counter = 0;
        try (BufferedReader brFirst = new BufferedReader(new FileReader(("Text")));
             BufferedReader brSecond = new BufferedReader(new FileReader("CensoredWords"));
        ) {
            String s1 = null;
            String s2 = null;
            s2 = brSecond.readLine();
            while ((s1 = brFirst.readLine()) != null) {
                String[] blackList = s2.split(" ");
                for (String s : blackList) {
                    if (s1.contains(s)) {
                        list.add(s1);
                        counter++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("Текст содержит недопустимых строк: " + counter + ". Ниже привёд список этих строк: ");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
