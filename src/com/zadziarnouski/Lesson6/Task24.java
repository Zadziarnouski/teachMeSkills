/*Задание 24
Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.*/

package com.zadziarnouski.Lesson6;

public class Task24 {
    public static void main(String[] args) {

        class intervalOfTime {
            private int hours;
            private int minutes;
            private int seconds;

            public int getHours() {
                return hours;
            }

            public void setHours(int hours) {
                this.hours = hours;
            }

            public int getMinutes() {
                return minutes;
            }

            public void setMinutes(int minutes) {
                this.minutes = minutes;
            }

            public int getSeconds() {
                return seconds;
            }

            public void setSeconds(int seconds) {
                this.seconds = seconds;
            }

            intervalOfTime(int seconds) {
                this.hours = seconds / 3600;
                this.minutes = (seconds % 3600) / 60;
                this.seconds = (seconds % 3600) % 60;
            }

            intervalOfTime(int hours, int minutes, int seconds) {
                this.hours = hours;
                this.minutes = minutes;
                this.seconds = seconds;
            }

            int statisticOfSeconds() {
                return hours * 3600 + minutes * 60 + seconds;
            }


            @Override
            public String toString() {
                return "Hours: " + hours + ", minutes: " + minutes + ", seconds: " + seconds;
            }
        }

        intervalOfTime t1 = new intervalOfTime(3600);
        intervalOfTime t2 = new intervalOfTime(1, 0, 0);
        System.out.println(t1.compareTo(t2));
        System.out.println(t1.toString());
        System.out.println(t2.toString());


    }
}