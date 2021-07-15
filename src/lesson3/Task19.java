package lesson3;

/**
 * Задание 17
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
 * таким образом:
 * <p>
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 **/

public class Lesson3_19 {
    public static void main(String[] args) {
        int[][] array = new int[5][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[5];
        }
        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > j || j >= array[i].length - i) {
                    array[i][j] = 0;
                } else array[i][j] = 1;
            }
        }
        for (int i = array.length - 1; i >= array.length / 2 + 1; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i)) {
                    array[i][j] = 0;
                } else array[i][j] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}


