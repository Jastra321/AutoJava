package org.autojava;

public class App {
    public static void main(String[] args) {
        Transport car = new Car("dodge", 1740.00, 1763.00, (short) 180);
        Transport bus = new Bus("Hyudai", 2400.00, 2250.00,  (short) 150);
        System.out.println(car.getInfo());
        System.out.println(bus.getInfo());
    }
}
