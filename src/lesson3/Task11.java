package lesson3;

/**
 * Задание 9
 * Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
 * произведение, т.е. факториал числа.
 **/

public class Lesson3_11 {
    public static void main(String[] args) {
        int factorialOfNumber = 1;
        int number = (int) (Math.random() * 10);
        if (number >= 0) {
            for (int x = 1; x <= number; x++) {
                factorialOfNumber *= x;
            }
            System.out.println(number + "! = " + factorialOfNumber);
        } else System.out.println("0! = 1");

    }
}

