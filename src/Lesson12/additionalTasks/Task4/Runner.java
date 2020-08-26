package Lesson12.additionalTasks.Task4;

/*4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс*/

import java.io.*;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Car kia = new Car("KIA",230.0, 30000);
        System.out.println("kia = " + kia.toString());
        System.out.println("hashCode kia = " + kia.hashCode());

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("Car.txt")))){
            oos.writeObject(kia);
        }catch (IOException e){
            e.getLocalizedMessage();
        }

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Car.txt"))){
            Car kiaClone = (Car) ois.readObject();
            System.out.println("kiaClone = " + kiaClone.toString());
            System.out.println("hashCode kiaClone = " + kiaClone.hashCode());
        }catch (IOException | ClassNotFoundException e2){
            e2.getLocalizedMessage();
        }







    }
}
