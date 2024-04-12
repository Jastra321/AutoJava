package org.autojava;

public class Reloader {

    public static void printInfo(){
        System.out.println("Метод не принимает параметры");
    }

    public static void printInfo(String s){
        System.out.println("Метод принимает String");
    }

    public static void printInfo(int s){
        System.out.println("Метод принимает int");
    }
}
