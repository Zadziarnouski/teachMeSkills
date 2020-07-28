package com.zadziarnouski.Lesson7.Transport;

public class Runner {
    public static void main(String[] args) {
        LightTransport bmw = new LightTransport("SUV", 5);
        bmw.letsGo(2);
        FreightTransport truck = new FreightTransport(4000);
        truck.loading(3500);
        CivilTransport boeing = new CivilTransport(350, true);
        boeing.capacityOfPassengers(340);
        MilitaryTransport stealth = new MilitaryTransport(300,true);
        stealth.shoot();
        stealth.bailout();

    }
}
