package lesson3;

/**
 * Задание 15
 * Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
 * еще один массив).
 **/

public class Task17 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 14, 15};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }
    }
}
