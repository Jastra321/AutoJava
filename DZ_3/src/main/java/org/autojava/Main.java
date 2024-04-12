package org.autojava;

public class Main {
    public static void main(String[] args) {

    Transport t1 = new Scooter(1,2, false, false, false, false, 0.0);
    t1.moving();

    Engine cadillac = new Engine("Cadillac", "gasoline", 8);
    Radiator r1 = new Radiator("R1");
    Battery varta = new Battery("Varta", 50000);

    Car kia = new Car("kia rio 2012", cadillac, r1, varta,5,  60, true, true, true, true, 98.7);
    Transport Hunday = new Bus(50, 50, true, true, true, false, 0.0);

    kia.stoping();
    Hunday.stoping();

    //6. примените перегрузку методов.
    Reloader.printInfo();
    Reloader.printInfo(Hunday.stoping());
    Reloader.printInfo(Hunday.getNumPassenger());

    //8. создайте любые 3 класса.
    Wheel w = new Wheel(100);
    CarWheel cw = new CarWheel(26);
    FinnishCarWheel fcw = new FinnishCarWheel(16);

    }
}