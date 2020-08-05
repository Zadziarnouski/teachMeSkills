package com.zadziarnouski.Lesson7.Transport;

public class Runner {
    public static void main(String[] args) {
        LightTransport bmw = new LightTransport(400,250,3000,"BMW M50d",4,7.2,"SUV",5);
        bmw.letsGo(2);
        FreightTransport truck = new FreightTransport(210,90,19000,"KAMAZ 5511",24,25,10000);
        truck.loading(1000);
        CivilTransport boeing = new CivilTransport(110000,850,79000,"Boeing 737-800",35,1630,349,true);
        boeing.capacityOfPassengers(349);
        MilitaryTransport stealth = new MilitaryTransport(50000,2000,20000,"Lockheed F-117 Nighthawk",20,200,150,true);
        stealth.shoot();
        stealth.bailout();
    }
}
