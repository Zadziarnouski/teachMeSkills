package Lesson7.space;

public class Shuttle implements IStart {

    @Override
    public boolean preLaunchSystemCheck() {
        if ((Math.random() * 10) > 3) {
            System.out.println("Проверка прошла успешно.");
            return true;
        } else
            return false;
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
