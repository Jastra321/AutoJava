package org.autojava;

public class DZ2 {
    /*
       ДЗ2
Напишите
if - else
сокращенный if
if - else - if
вложенный if
swith-case
while
do-while
for
for внутри которого if

     */

    public void doDZ2() {
        System.out.println("ДЗ 2");

        //if - else
        if (2 * 2 != 4 ) {
            System.out.println("Ошибка.");
        } else {
            System.out.println("Ошибок нет. IF-else");
        }
        //сокращенный if
        if (5 > 1) {
            System.out.println("no errors. If without else");
        }

        //if - else - if
        if (7 == 9) {
            System.out.println("Ошибка.");
        } else if (7 == 7) {
            System.out.println("Ошибки нет. If - else IF");
        }

        //вложенный if
        if ("a".equals("z")) {
            System.out.println("Ошибка.");
        } if ("a".equals("r")) {
            System.out.println("Ошибка.");
        } if ("a".equals("a")) {
            System.out.println("Корректная обработка. if-if -if");
        } else {
            System.out.println("Ошибка.");
        }

        //swith-case
        String inBox = "apple";
        Boolean fruit = false;
        Boolean berry = false;
        Boolean notForEat = false;
        switch (inBox) {
            case "cherry": berry = true;
                            break;
            case "apple": fruit = true;
                            break;
            default: notForEat = true;
                    break;
        }

        //while
        int q = 11;
        while (q >0) {
            System.out.println(" some work");
            --q;
        }

        //do-while
        do {
            System.out.println(" some work");
            ++q;
        } while (q < 10);

        //for
        for (int g = 0; g <20; g++) {
            System.out.println(g);
        }

        //for внутри которого if
        for (int g = 0; g <20; g++) {
            System.out.println(g);
            if (g == 10) {
                System.out.println(" do something");
            }
        }

    }
}
