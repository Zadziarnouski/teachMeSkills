package lesson3;

/**
 * 3)Вычислить: 1+2+4+8+...+256
 **/

public class Lesson3_3 {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 2; i < 257; i *= 2) {
            number += i;
        }
        System.out.println(number);
    }
}
