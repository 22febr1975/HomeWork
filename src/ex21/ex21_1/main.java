package ex21.ex21_1;
/*1) Создайте метод, который просит у пользователя ввести с клавиатуры число
        и делит данное число на другое случайно сгенерированное число в диапазоне от -10
        до 10.
        Исключительная ситуация должна возникать, если сгенерированное число равно нулю,
        а также если полученное частное двух чисел принимает отрицательное значение.
        Если сгенерированное число не равно нулю, то в любом случае данный метод
        выводит в консоль информацию о том какое число было введено пользователем, какое число было
        сгенерировано, и какое число получится при делении одного числа на другое.
        Все исключительные ситуации обработать внутри метода.*/

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner b = new Scanner(System.in);
        int x = b.nextInt();
       int[] a = new int[21];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ((Math.random() * 21) - 10);
        }
        int[] a1 = Arrays.copyOfRange(a, 0, a.length);
        System.out.println(Arrays.toString(a1));
        int y = (int) Math.floor(Math.random() * a1.length);
        System.out.println("Случайное число из массива = "+a1[y]);
        try {
            double z= x/a1[y];
            System.out.println("Результат деления Вашего числа на случайное число из массива = "+z);
        } catch (ArithmeticException e)
    {System.out.println("При делении на ноль получили бесконечно большое число");}

    }
}
