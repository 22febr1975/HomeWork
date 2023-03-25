package ex18_2;
/*2) Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком,
        а также нечетные числа списком.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex18_2 {
    public static void masiv(int[] C) {
        System.out.println(Arrays.toString(C));
        int sum = 0;
        for (int i = 0; i < C.length; i++) {
            sum = sum + C[i];
        }

        int[] arrayB;
        int[] arrayD;

        List<Integer>[] listArr = new List[2];
        listArr[0] = new ArrayList<>();
        listArr[1] = new ArrayList<>();
        for (int elemArr : C) {
            if (elemArr % 2 != 0)
                listArr[0].add(elemArr);
            else listArr[1].add(elemArr);
        }
        arrayB = new int[listArr[0].size()];
        for (int i = 0; i < listArr[0].size(); i++) {
            arrayB[i] = listArr[0].get(i);
        }
        arrayD = new int[listArr[1].size()];
        for (int i = 0; i < listArr[1].size(); i++) {
            arrayD[i] = listArr[1].get(i);
        }
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(arrayD));
    }
}




