package com.zadziarnouski.Lesson7.space;

public class Cosmodrome {

    public void launch(IStart object) {
        if (object.preLaunchSystemCheck() == true) {
            object.engineStarting();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            object.start();
        } else System.out.println("Предстартовая проверка провалиась.");
    }
}
