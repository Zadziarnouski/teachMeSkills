package Lesson7.task26;

/*
Задание 26
Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
*/

public class Runner {
    public static void main(String[] args) {
        Appliances philips = new VacuumCleaner("Philips", "Cleaning", 285, 2000, "blue", 4.5);
        Appliances bosch = new BatteryVacuumCleaner("Bosch", "Cleaning", 1400, 1000, "green", 3.5, true, 2600, 40);
        RobotVacuumCleaner xiaomi = new RobotVacuumCleaner("Xiaomi", "Cleaning", 500, 500, "grey", 4, true, 5200, 150, true);

        ((VacuumCleaner) philips).plugIn(); //
        philips.turnOn();
        philips.turnOn();
        ((VacuumCleaner) philips).clean();
        philips.turnOff();

        ((BatteryVacuumCleaner) bosch).putOnCharge();
        bosch.turnOn();
        ((BatteryVacuumCleaner) bosch).clean();
        bosch.turnOff();

        xiaomi.putOnCharge();
        xiaomi.turnOff();
        xiaomi.clean("Kitchen");
        xiaomi.turnOff();

    }
}
