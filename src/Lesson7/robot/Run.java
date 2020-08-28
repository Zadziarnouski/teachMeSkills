package Lesson7.robot;

import Lesson7.robot.hands.*;
import Lesson7.robot.heads.*;
import Lesson7.robot.legs.*;


public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHand sonyHand = new SonyHand(200);
        IHead toshibaHead = new ToshibaHead(500);
        ILeg toshibaLeg = new ToshibaLeg(150);
        IHand toshibaHand = new TohibaHand(175);
        ILeg samsungLeg = new SamsungLeg(225);


        IRobot robot1 = new Robot(toshibaHead, sonyHand, toshibaLeg);
        IRobot robot2 = new Robot(toshibaHead, toshibaHand, toshibaLeg);
        IRobot robot3 = new Robot(toshibaHead, sonyHand, samsungLeg);

        robot1.action();
        robot2.action();
        robot3.action();

        System.out.println(robot1.getPrice());  //850
        System.out.println(robot2.getPrice()); // 825
        System.out.println(robot3.getPrice()); // 925 - самый дорогой


    }
}
