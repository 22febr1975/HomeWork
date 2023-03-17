package ex17;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
/*4)Имеется массив, размер которого должен быть четным числом и  этот размер вводится пользователем с клавиатуры.
        Значения элементов задаются случайным образом в диапазоне от 0 до 100.
        Отсортировать первую половину данного массива по возрастанию, а вторую по
        убыванию. Вывести на экран изначальный и отсортированный массив.*/
public class ex17_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ВВедите размер массива");
        int n = s.nextInt();
        if (n % 2 != 0) {
        System.out.println("Это не четное число, попробуйте еще раз");
        }
        else {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
        a[i] = (int) (Math.random() * 100);
        System.out.println(a[i]);
        }
            System.out.println(Arrays.toString(a));
            int[] a1 = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] a2 = Arrays.copyOfRange(a, a.length / 2, a.length);
            Integer [] a3 = Arrays.stream(a2).boxed().toArray(Integer[]::new);
            Arrays.sort(a1);
            Arrays.sort(a3, Collections.reverseOrder());
            System.out.println("Первая часть массива " + Arrays.toString(a1));
            System.out.println("Вторая часть массива " + Arrays.toString(a3));
        }
    }
}