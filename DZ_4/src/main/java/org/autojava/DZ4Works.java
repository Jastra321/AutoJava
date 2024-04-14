package org.autojava;

/**
 * если A не содержит B, вернуть -1. Если содержит, то вернуть индекс из стринги A, с которого начинается стринга B в A
 */
public class DZ4Works {
    public static Integer doCheckStringContainsString(String a, String b) {
        return a.indexOf(b);
    }

    /**
     * @param arr целочисленный отсортированный массив
     * @param b число
     * @return Если число есть в массиве то напечатать его индекс.
     *          Если числа нету, то напечатайте индекс, где число было бы, если бы оно было вставлено в массив.
     */
    public static Integer doCheckMassContainsNumber(Integer[] arr, Integer b) {
        Integer idx = 0;
        boolean isExist = false;
        for (Integer q = 0; q < arr.length ; q++) {
            if (arr[q] == b) {
                idx = q;
                break;
            } else if ((isExist == false) & (arr[q] > b)) {
                idx = q;
                break;
            }
        }
        return idx;
    }

    public static Boolean doChekMassContainsDuplicate(Integer[] arr) {
        Boolean answer = false;
        Integer i = 0;
     //   System.out.println("...............");
        do {
            for (Integer j = 0; j < arr.length; j++){
        //        System.out.println("i = "+ arr[i] + "; j = "+ arr[j]);
                if (i == j) {
                    continue;
                } else if (arr[i] == arr[j]) {
                    answer = true;
                    break;
                };
            }
            i++;
        } while ((i < arr.length) & (answer == false));
        return answer;
    }
}
