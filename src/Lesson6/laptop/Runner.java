package Lesson6.laptop;

import Lesson6.laptop.Laptop;

public class Runner {
    public static void main(String[] args) {
        Laptop dell = new Laptop("i7", "16 GB", "1 TB");
        System.out.println(dell.toString());
        dell.turnOn();
        dell.turnOn();
        dell.turnOff();
        dell.turnOff();
    }
}
