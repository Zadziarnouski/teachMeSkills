package Lesson7.human;

import com.zadziarnouski.Lesson7.human.jackets.*;
import com.zadziarnouski.Lesson7.human.pants.*;
import com.zadziarnouski.Lesson7.human.shoes.*;

public class Run {
    public static void main(String[] args) {
        /*2) По аналогии с первым задание делаем след. задание. 
Интерфейсы: 
- Куртка 
- Штаны 
- Обувь
в каждом интерфейсе есть 2 метода (надеть и снять)
Делаем несколько реализации каждого интерфейса. 
Создаём класс человек: 
У человека поля: 
-имя 
-куртка 
-штаны 
-обувь
У человека есть 2 метода: 
- одеться(вызываются методы надеть у всех вещей) 
- раздеться (вызываются методы снять у всех вещей)*/
        IJacket jacket1 = new NikeJacket(100);
        IPants pants1 = new NikePants(80);
        IShoes shoes1 = new NikeShoes(90);

        IJacket jacket2 = new VersaceJacket(1500);
        IPants pants2 = new VersacePants(1000);
        IShoes shoes2 = new ColumbiaShoes(2000);

        IJacket jacket3 = new ColumbiaJacket(250);
        IPants pants3 = new ColumbiaPants(300);
        IShoes shoes3 = new ColumbiaShoes(400);

        IHuman gopnic = new Human(jacket1,pants1,shoes1);
        IHuman modnic = new Human(jacket2,pants2,shoes3);
        IHuman turist = new Human(jacket3, pants3,shoes3);

        gopnic.putOn();
        gopnic.takeOff();
        System.out.println(gopnic.getPrice());

        modnic.putOn();
        modnic.takeOff();
        System.out.println(modnic.getPrice());

        turist.putOn();
        turist.takeOff();
        System.out.println(turist.getPrice());
    }
}
