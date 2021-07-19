package lesson3;

/**
 * 6)Напишите программу вывода всех четных чисел от 2 до 100 включительно.
 **/

public class Task6 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) System.out.print(i + "\t");
        }
    }
}
