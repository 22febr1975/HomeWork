package ex17;

import java.util.Arrays;

/*3)
        Заполнить массив на 45 элементов случайными числами
        от -50 до +50. Найти минимальный элемент и вывести его
        на консоль. Найти максимальный элемент и вывести его на*/
public class ex17_3 {
    public static void main(String[] args) {
        int[] a = new int[45];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ((Math.random() * 101) - 50);
                    }
        int[] a1 = Arrays.copyOfRange(a, 0, a.length);
        System.out.println(Arrays.toString(a1));
        int min = a1[0];
        int max = a1[0];
        for (int j = 1; j < 45; j++){
            if (min>a1[j]){min = a1[j];
                continue;
            }
           if (max<a1[j]){max = a1[j];
            }
        }System.out.println("Минимальное число = " + min);
        System.out.println("Максимальное число = " + max);
             }}