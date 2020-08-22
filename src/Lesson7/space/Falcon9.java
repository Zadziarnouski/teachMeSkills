package Lesson7.space;

public class Falcon9 implements IStart {
    private int numberOfAstranauts;

    public Falcon9(int numberOfAstranauts) {
        this.numberOfAstranauts = numberOfAstranauts;
    }

    public Falcon9() {
    }

    @Override
    public boolean preLaunchSystemCheck() {
        if (numberOfAstranauts == 5) {
            System.out.println("Все астранавты на своих местах.");
            if ((Math.random() * 10) > 3) {
                System.out.println("Проверка прошла успешно.");
                return true;
            } else return false;
        } else {
            System.out.println("Не все астранавты на своих местах.");
            return false;
        }
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатель Falcon 9 запущен!");
    }

    @Override
    public void start() {
        System.out.println("Поехали!");
    }
}
