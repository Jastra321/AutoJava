package org.autojava;
import javax.crypto.Cipher;
import java.util.*;
//ищем первое число, у которого частота в одном из вариантов, которые ищутся последовательности
// если есть число с частотой больше половину массива, то это число
// если есть число с частотой в половину массива и нет большей частоты, то это число.
// если нет чисел с частотой в половину массива и больше, то первое число массива.

//решение: если очень маленький массив и нет чисел частотой больше половины, выводим первый элемент.
// в других случаях перебираем массив и ищем элемент с частотой в половину массива или больше.
// флаг found  нужен для использования только первого найденного совпадения
//HashSet для получения ключе без дубля

public  class Solution169 {

    protected  int majorityElement(int[] nums){
        HashSet<Integer> hset = new HashSet<Integer>();
        HashMap<Integer,Integer> lHMap = new HashMap<Integer, Integer>();

        for (Integer a: nums) {
            hset.add(a);
        }

        for (Integer a: hset){
            Integer countation = 0;
            for (Integer q: nums) {
                if (q == a )  countation++;
            }
            lHMap.put(a, countation);
        }

        hset.clear();
        int returnation = 0;
        Integer maxLenght = nums.length / 2;
        Integer BigFreq = Collections.max(lHMap.values());
        if ( BigFreq < maxLenght) BigFreq = 0;
        Boolean found = false;

//        System.out.println(".............");
//        System.out.println(" maxL "+ maxLenght + " bigF " + BigFreq);
//        for (Map.Entry<Integer, Integer> q: lHMap.entrySet()) {
//            System.out.printf("Key: %s,  Value: %s \n", q.getKey(), q.getValue().toString());
//        }

        if ((maxLenght == 1)  || (BigFreq == 0) ) {
            returnation = lHMap.entrySet().iterator().next().getKey();
        } else  {
            for (Integer q :nums) {
                if ( (lHMap.get(q) == maxLenght && !found) || (lHMap.get(q) == BigFreq && !found) ) {
                    returnation = q;
                    found = true;
                }
            }
        }
//        System.out.println("ret" + returnation);
//        System.out.println(".............");

        return returnation;
    }
}
