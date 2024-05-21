package org.autojava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        FileReporter f = new FileReporter();
        f.setDictionry();
        //f.writeFile();


        iParabola calc = (i) -> 2*i*i + 6*i + 14;
        System.out.println("схема параболы в машстабле 1 к 50 по оси Y.");
        System.out.println("---------------------->  X=-100  Ось Y");
        for (int i = -100; i <= 100; i= i +10){
            int a = calc.calcParabola(i)/50;
            for(int q = 0; q < a; q++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println("---------------------->  X=100  Ось Y");
        System.out.println();
        System.out.println("Stream usage");

        HashMap<String, Integer>  hmWords = f.getDictionry();
        List<String> arrStr = hmWords.keySet().stream().toList();
        List<String> arrNumeric = new ArrayList<>();
        for ( String q: arrStr) {
           String str = q.replaceAll("[^\\d.]", "").trim();
           if (!str.isEmpty() )  {
               arrNumeric.add(str);
           }
        }

        System.out.println(arrNumeric.stream().map(Integer::valueOf).toList());
        System.out.println();
        System.out.println(arrNumeric.stream().sorted().toList());
        System.out.println();
        System.out.println(arrNumeric.stream().count());
        System.out.println();
        arrNumeric.stream().map(Integer::valueOf).filter(a ->  a > 5).sorted().toList().forEach(System.out::println);
        System.out.println();

    }
}
