package Lesson3;

/**
 * Метод сортировки массива "пузырьком"
 **/
public class bubble_method {
    public static void main(String[] args) {
        int[] array = {40, 20, 30, 10, 60, 80, 100, 50, 70, 90};
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
