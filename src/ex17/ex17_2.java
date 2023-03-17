package ex17;

import java.util.Scanner;

/*2)
        Есть одномерный массив из 10 элементов, заполнен-
        ный случайными числами. Пользователь вводит с клавиатуры
        число. Программа показывает есть ли такое число в созданном
        до этого массиве.*/
public class ex17_2 {
    public static void main(String[] args) {
        int[] a = {1, 12, 4, 6, 18, 7, 15, 10, 3, 20};
        boolean c = false;
        System.out.println("Введите любое целое число от 1 до 20");
        Scanner b = new Scanner(System.in);
        int x = b.nextInt();
        for (int y : a) {
            if (y == x) {
                c = true;
                break;
            }
        }
       /* System.out.println(c);*/
        if (c != true){System.out.println("Такого числа в массиве нет");}
        else {System.out.println("Вы угодали, возьмите с полки пирожок");}
    }
}
