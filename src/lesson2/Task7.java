package lesson2;

import java.util.Scanner;

/**
 * В переменную записываете количество программистов. В зависимости от количества
 * программистов необходимо вывести правильно окончание. Например: • 2 программиста
 * • 1 программиста • 10 программистов • и т.д.
 **/

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfProgrammer = sc.nextInt();
        if (countOfProgrammer == 1) {
            System.out.println(countOfProgrammer + " программист");
        } else if (2 <= countOfProgrammer && countOfProgrammer <= 4) {
            System.out.println(countOfProgrammer + " программиста");
        } else System.out.println(countOfProgrammer + " программистов");
    }
}
