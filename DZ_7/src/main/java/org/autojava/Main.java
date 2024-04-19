package org.autojava;

import static org.autojava.Operation_mode.guard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Robot r1 = new Robot("android", "f253gswrtyae535eqr", 1800, 500, 100, guard  );
    Robot r2 = new Robot("kangaroo", "rew4swrtyyt08f5eqr", 1000, 400, 100, guard  );
    Robot r3 = new Robot("dog", "rew4swrtyyt08f5eqr", 500, 400, 100, guard  );
    Robot r4 = new Robot("android", "f253gswrtyae500000", 1800, 500, 10, guard  );
    Robot rArray[] = {r1, r2, r3};
    for (Robot q : rArray) {
        System.out.println(q.getModel() + " message:");
        q.doSendMassage();
        System.out.println(q.getModel() + " to sting");
        System.out.println(q.toString());
        System.out.println(q.getModel() + " hashcode");
        System.out.println(q.hashCode());
        System.out.println(q.getModel() +"  цвет робота");
        System.out.println(q.getColor());
        System.out.println(".............");
    }
    }
}

/*
Домашнее задание 7
1. Переопределите toString, equals, hashcode и вызовите их в main методе
2. Добавьте статическую переменную и статический метод, вызовите метод в main методе
3. Создайте любой енам, в енаме должны быть переменные, конструктор, геттеры. В main методе распечатайте енам
4. Напишите свой hashcode and equals
 */