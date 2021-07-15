package lesson10;

import java.io.*;
import java.util.Random;

/*
Задание 35
Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.
*/
public class Task35 {
    public static void main(String[] args) {
        Random random = new Random();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"))) {

            for (int i = 0; i < 20; i++) {
                dos.writeInt(random.nextInt(100));
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        int summ = 0;
        int numbersCounter = 0;
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"))) {
            while (dis.available() > 0) {
                int i = dis.readInt();
                summ +=i;
                System.out.print(i + "\t");
                numbersCounter++;
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println();
        System.out.println("Среднее арифметическое: " + (double)summ/numbersCounter);


    }
}
