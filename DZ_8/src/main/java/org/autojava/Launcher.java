package org.autojava;

import lombok.Getter;

import java.util.*;

public class Launcher {

    private static Student mike = new Student(1, "Arbuzov", "Mike", null);
    private static Student jhon = new Student(2, "Smith", "Jhon", null);
    private static Student dmitro = new Student(3, "Smirnov", "Dmitro", null);


    public static void main(String[] args)  {
        try {
            RegisterNewClient.chackAge(5);
        } catch (InvalidAgeException e)
        {
            System.out.println("InvalidAgeException occured: " + e);
        }
        RegisterNewClient.checkFile();

        runArrayListStud( mike, jhon, dmitro);
        runHeshSet(mike, jhon, dmitro);
        runLinkedHeshSet(mike, jhon, dmitro);
        runTreeSet(mike, jhon, dmitro);
        runHashMap(mike, jhon, dmitro);
    }

    protected static void runArrayListStud(Student a, Student b, Student c) {
        System.out.println("...start use ArrayList");

        ArrayList<Student> listStud = new ArrayList<>();
        listStud.add(a);
        listStud.add(b);
        listStud.add(c);
        listStud.add(a);

        System.out.println("Вывод коллекции на печать:");
        for (Student q : listStud){
            System.out.println(q.toString());
        }
        System.out.println("");

        listStud.remove(3);
        System.out.println("get some elemrnt: " + listStud.get(1).getFa());

        System.out.println("Поиск студента по фамилии:");
        for (Student q : listStud){
            if (q.getFa() == "Arbuzov") {
                System.out.println(q.toString());
            }
        }


        System.out.println("...end of use ArrayList");
        System.out.println("");
    }

    protected static void runHeshSet(Student a, Student b, Student c){
        System.out.println("...start use HashSet");
        HashSet<Student> hsStud = new HashSet<>();
        hsStud.add(a);
        hsStud.add(b);
        hsStud.add(c);
        System.out.println("Вывод коллекции на печать:");
        for (Student q : hsStud) {
            System.out.println(q.toString());
        }
        System.out.println("");

        hsStud.remove(a);

        System.out.println("Поиск студента по фамилии:");
        for (Student q : hsStud){
            if (q.getFa()=="Smirnov") {
                System.out.println(q.toString());
            }
        }

        System.out.println("...end of use HashSet");
        System.out.println("");
    }

    protected static void runLinkedHeshSet(Student a, Student b, Student c) {
        System.out.println("...start use LinkedHeshSet");
        LinkedHashSet<Student> lhsStud = new LinkedHashSet<>();
        lhsStud.add(a);
        lhsStud.add(b);
        lhsStud.add(c);

        System.out.println("Вывод коллекции на печать:");
        for (Student q : lhsStud) {
            System.out.println(q.toString());
        }
        System.out.println("");

        lhsStud.remove(c);

        System.out.println("Поиск студента по фамилии:");
        Iterator<Student> iStud = lhsStud.iterator();
        while (iStud.hasNext()) {
            Student s = iStud.next();
            if (s.getFa() == "Smith") {
                System.out.println(s.toString());
            }
        }

        System.out.println("...end of use LinkedHeshSet");
        System.out.println("");
    }

    protected static void runTreeSet(Student a, Student b, Student c) {
        System.out.println("...start use TreeSet");
        TreeSet<Student> tsStud = new TreeSet<Student>();

        tsStud.add(a);
        tsStud.add(b);
        tsStud.add(c);

        System.out.println("Вывод коллекции на печать:");
        for (Student q: tsStud) {
            System.out.println(q.toString());
        }
        System.out.println("");

        tsStud.remove(c);

        System.out.println("Поиск студента по фамилии:");
        for (Student q: tsStud) {
            if (q.fa == "Arbuzov") {
                System.out.println(q.toString());
            }
        }

        System.out.println("...end of use TreeSet");
        System.out.println("");
    }

    protected static void runHashMap(Student a, Student b, Student c) {
        System.out.println("...start use HashMap");
        HashMap<Integer, Student> hmStud = new HashMap();

        hmStud.put(1, a);
        hmStud.put(2, b);
        hmStud.put(3, c);

        System.out.println("Вывод коллекции на печать:");
        for (Map.Entry<Integer, Student> q: hmStud.entrySet()) {
            System.out.printf("Key: %s,  Value: %s \n", q.getKey(), q.getValue().toString());
        }
        System.out.println("");

        hmStud.remove(1);

        System.out.println("Поиск студента по фамилии:");
        for (Map.Entry<Integer, Student> q: hmStud.entrySet()) {
            if (q.getValue().getFa() == "Smirnov") {
                System.out.printf("Key: %s,  Value: %s \n", q.getKey(), q.getValue().toString());
            }

        }

        System.out.println("...end of use HashMap");
        System.out.println("");
    }

}
