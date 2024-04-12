package org.autojava;

public class DZ1 {

/*
ДЗ1
Попрактикуйте
Арифметические операторы: +     -     *     /     %     ++     --
Операторы сравнения: ==     !=     >     <     >=     <=
Операторы присваивания: =     +=     -=     *=     /=     %=
.......................................
Просто применяю операторы в программе.
 */
    public void doDZ1() {
        System.out.println("ДЗ 1");
        System.out.println("Арифметические операторы: +     -     *     /     %     ++     --");
        System.out.println("Применяем +     -     *     /     %  и получаем некоторое число.");
        Double a = ((8.74 + 3 - 1)/2)%0.005;
        System.out.println(a);
        System.out.println();
        System.out.println("Применяем  ++     -- в постфиксной и префиксной форме.");
        int h = 1;
        int j = ++h;
        //в следующей строке IDE подсвечивает оператор блеклым цветом, подсказывая, что значение не применяется.
        h = h--;
        System.out.println("h = " + h + "; j = " + j + ";");
        System.out.println();

        System.out.println("Операторы сравнения: ==     !=     >     <     >=     <=");
        Boolean k = (h == 1 ? true : false);
        Boolean l = (k != true ? true : false);
        System.out.println("k = " + k + "; l = " + l +";");
        k = ( a > 0 ? true : false);
        l = ( a < 1 ? true : false);
        System.out.println("k = " + k + "; l = " + l +";");
        k = ( h >= 0 ? true : false);
        l = ( h < 1 ? true : false);
        System.out.println("k = " + k + "; l = " + l +";");
        System.out.println();

        System.out.println("Операторы присваивания: =     +=     -=     *=     /=     %=");
        k = l;
        System.out.println("k = " + k + "; l = " + l +";");
        a += h;
        System.out.printf("a = %f\n", a);
        h -= j;
        System.out.println("h = " + h);
        a *= j;
        System.out.printf("a = %f\n", a);
        a /= 2;
        System.out.printf("a = %f\n", a);
        j %= 2;
        System.out.println("j = " + j);
    }

    /*


.......................................
 ДЗ 4
Задача 1. Дано две стринги А и B, если A не содержит B, напечатать -1, если содержит, то напечатать индекс из стринги A, с которого начинается стринга B в A
Пример  1:
Исходные данные: A = “asadbut", B = "sad"
Результат: 1

Пример 2:
Исходные данные: A = "leetcode", B = "leeto"
Результат: -1 так как А не содержит В

Задача 2. Есть отсортированный массив и число. Если число есть в массиве то напечатать его индекс. Если числа нету, то напечатайте индекс, где число было бы, если бы оно было вставлено в массив.
Пример 1:
Исходные данные: : nums = [1,3,5,6], число = 5
Результат: 2 - число 5 имеет индекс 2

Пример 2:
Исходные данные: : nums = [1,3,5,6], число = 2
Результат: 1 - числа 2 нету в массиве, но если было бы, то индекс был бы 1, так как число 2 должно находится в массиве между числами 1 и 3

Пример 3:
Исходные данные: : nums = [1,3,5,6], число = 7
Результат: 4 - числа 7 нету в массиве, но если бы было то после числа 6

Задача 3. Есть массив. Напечатать true, если в массивы есть элементы, которые повторяются. Напечатать false, если массив содержит только уникальные числа

Пример 1:
Исходные данные: nums = [1,2,3,1]
Результат: true

Пример 2:
Исходные данные: nums = [1,2,3,4]
Результат: false

.......................................
Домашнее задание 5:
1. Добавить в pom.xml
  <dependency>
      <groupId>org.apache.commons</groupId>
      <artifactId>commons-lang3</artifactId>
      <version>3.12.0</version>
    </dependency>

Если библиотека правильно добавлена то в своем классе вы можете написать StringUtils и вызвать какой-нибудь метод из этого класса, импорт для этого класса будет import org.apache.commons.lang3.StringUtils;
2. Добавить в pom.xml
  <dependency>
      <groupId>commons-io</groupId>
      <artifactId>commons-io</artifactId>
      <version>2.15.1</version>
  </dependency>

Если библиотека правильно добавлена то в своем классе вы можете написать FileUtils и вызвать какой-нибудь метод из этого класса, импорт для этого класса будет import org.apache.commons.io.FileUtils;
Писать какую-то логику с StringUtils и FileUtils не надо. Просто убедитесь что библиотеки подключены
3.
-Создайте класс Transport, Car, Bus
-Car и Bus должны наследовать класс Transport;
-создайте в классе Transport поля model, height, weight, maxSpeed
-создайте один метод в классе Transport
-создайте конструкторы в классе Transport: 1 - без параметров, 2 - все параметры, 3 - только с одним параметром
-сделайте одно поле private, одно - default(для default не надо писать модификатор доступа), одно - protected, еще одно public
-создайте гетер и сетер для private переменной
-создайте еще один класс с методом main
-создайте обьекты для Car  и Bus в main методе и вызовите для них метод из класса Transport

.......................................
ДЗ 6
1. Используйте полиморфизм, можете просто напечатать код из занятия или из видео из ютуба
2. Создайте три интерфеса с абстрактными и дефолтными методами
3. Добавьте интерфейсы в классы
4. Переопределите методы в классах из интерфейсов
     */
}