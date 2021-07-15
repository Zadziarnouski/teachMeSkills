package lesson3;

/**
 * Сортировка массива методом прямого выбора
 **/
public class directChoise_method {
    public static void main(String[] args) {
        int[] array = {40, 20, 30, 10, 60, 80, 100, 50, 70, 90};
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
