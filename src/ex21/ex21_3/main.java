package ex21.ex21_3;
/*
3) Создать метод, в котором создается одномерный массив типа int произвольного размера
        от 1 до 30, в котором каждому элементу массива присваивается произвольное значение от
        0 до 30.
        Данный метод спрашивает у пользователя ввести с клавиатуры индекс случайно сгенерированного массива.
        Метод возвращает значение типа double, которое получается при делении элемента с указанным
        индексом пользователя на первый элемент данного массива.

        Продумать все возможные исключительные ситуации, которые могут возникнуть в данном методе.
        Для каждой исключительной ситуации создать собственный класс checked исключения.
        Прописать в методе условия генерации данных исключений, а также указать их в сигнатуре данного
        метода.

        Обработку исключения осуществить в сторонеем классе Main в котором нужно вызвать данный метод.
*/

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws NoDivisionNullException {
        Scanner s = new Scanner(System.in);
        System.out.println("ВВедите размер массива от 1 до 30");
        int n = s.nextInt();
        Scanner index = new Scanner(System.in);
        System.out.println("ВВедите индекс элемента массива от 1 до 30");
        int m = index.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) (Math.random() * 30);
                }
            System.out.println(Arrays.toString(a));

            if (a[0] == 0){
                throw new NoDivisionNullException();
            }
            double result = a[m]/a[0];
            System.out.println("Элемент с указанным индексом = "+ a[m]);
            System.out.println("Петвый элемент данного массива = "+ a[0]);
            System.out.println("Результат при делении элемента с указанным индексом \nна первый элемент данного массива = "+ result);



        }

    }
