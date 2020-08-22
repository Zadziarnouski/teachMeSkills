/*
Задание №26
Создать класс компьютер.
Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)

Методы:
- метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает. Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает
*/
package Lesson6.laptop;

import java.util.Random;
import java.util.Scanner;

public class Laptop {
    private String CPU, RAM, HDD;
    int numberOfCompleteWorkCycles;
    static boolean pcTurnedOn = false;
    static boolean itWorks = true;


    public Laptop(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        numberOfCompleteWorkCycles = 500;
    }

    Scanner sc = new Scanner(System.in);

    public void turnOn() {
        Random random = new Random();
        int randNumber = random.nextInt(2);
        if (itWorks == false) {
            System.out.println("PC burned out");
            return;
        }
        if (pcTurnedOn == true) {
            System.out.println("PC is already on.");
            return;
        }
        System.out.println("0 or 1?");
        int answerOfUser = sc.nextInt();
        while (answerOfUser != 0 && answerOfUser != 1) {
            System.out.println("0 or 1?");
            answerOfUser = sc.nextInt();
        }

        if (randNumber == answerOfUser) {
            System.out.println("Welcome!!!");
            pcTurnedOn = true;
        } else if (randNumber != answerOfUser) {
            System.out.println("Sorry, an unknown error has occurred!PC burned out!");
            itWorks = false;
        }

    }

    public void turnOff() {
        Random random = new Random();
        int randNumber = random.nextInt(2);
        if (itWorks == false) {
            System.out.println("PC burned out");
            return;
        }
        if (pcTurnedOn == false) {
            System.out.println("PC is already off.");
            return;
        }
        System.out.println("0 or 1?");
        int answerOfUser = sc.nextInt();
        while (answerOfUser != 0 && answerOfUser != 1) {
            System.out.println("0 or 1?");
            answerOfUser = sc.nextInt();
        }
        if (randNumber == answerOfUser) {
            System.out.println("Shutdown completed!");
            pcTurnedOn = false;
        } else if (randNumber != answerOfUser) {
            System.out.println("Sorry, an unknown error has occurred!PC burned out!");
            itWorks = false;
        }
        sc.close();


    }

    @Override
    public String toString() {
        return "Characteristics of this laptop: CPU - " + CPU + ", RAM - " + RAM + ", HDD - " + HDD + ". Number of complete work cycles: " + numberOfCompleteWorkCycles + " times.";
    }
}
