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
        for (int i = 0; i < 9; i++) {
            System.out.println("Введите любое целое число от 1 до 20");
            Scanner b = new Scanner(System.in);
            int x = b.nextInt();
            if (x != a[i]) {
                System.out.println("Такого числа в массиве нет");
                System.out.println("Попробуйте еще раз");
            } if (x == a[i]){
                System.out.println("Вы угодали, возьмите с полки пирожок");
            }
            }
    }
}