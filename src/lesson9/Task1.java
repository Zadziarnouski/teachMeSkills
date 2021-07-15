package lesson9;

import java.util.ArrayList;
import java.util.List;

/*Задание 29
Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.
*/
public class Task29 {
    public static void main(String[] args) {
        List<Integer> assesments = new ArrayList<>();
        assesments.add(9);
        assesments.add(3);
        assesments.add(4);
        assesments.add(2);
        assesments.add(8);
        assesments.add(7);
        assesments.add(4);
        assesments.add(5);
        assesments.add(1);

        for (int i = 0; i < assesments.size(); i++) {
            if (assesments.get(i) < 4) {
                assesments.remove(assesments.get(i));
            }
        }
        for (Integer i : assesments) {
            System.out.print(i + "\t");
        }

    }
}


