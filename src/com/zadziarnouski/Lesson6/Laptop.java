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
package com.zadziarnouski.Lesson6;

public class Laptop {
    private String CPU, RAM, HDD;
    int numberOfCompleteWorkCycles;
    static int status = 1;
    static boolean computerIsOn = false;

    public Laptop(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        numberOfCompleteWorkCycles = 500;

    }

    public void turnOn(int randomNumber) {
        if (computerIsOn == false) {
            if (status == 0) {
                System.out.println("Ноутбук сгорел!");
                return;
            }
            long random = Math.round(Math.random());
            if (randomNumber == random) {
                System.out.println("WELCOME!!!");
                computerIsOn = true;
            } else if (randomNumber != random) {
                System.out.println("Произошёл сбой питания!Ноутбук сгорел!");
                status--;
            }
        }
        else System.out.println("Компьютер уже включён.");


    }

    public void turnOff(int randomNumber) {
        if (status == 0) {
            System.out.println("Ноутбук сгорел!");
            return;
        }
        long random = Math.round(Math.random());
        if (randomNumber == random) {
            System.out.println("BYE-BYE!!!");
        } else if (randomNumber != random) {
            System.out.println("Произошёл сбой питания!Ноутбук сгорел!");
            status--;
        }

    }


    @Override
    public String toString() {
        return "Characteristics of this laptop: CPU - " + CPU + ", RAM - " + RAM + ", HDD - " + HDD + ". Number of complete work cycles: " + numberOfCompleteWorkCycles + " times.";
    }
}
