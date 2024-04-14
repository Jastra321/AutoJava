package org.autojava;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();
        System.out.println( car.getReview());
        System.out.println( bus.getReview());
    }
}
