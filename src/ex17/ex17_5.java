package ex17;

import java.util.Scanner;

/*5)
        Необходимо вывести на экран перевернутый прямоугольный треугольник
        прямым углом сверху в левой части.
        Для вывода использовать условные операторы, циклы.
        Команду System.out.println(); System.out.print(); и можно использовать только
        с одним символом *.
        Пользователь вводит с клавиатуры число, которое будет считаться основанием треугольника,
        а программа выводит сам треугольник.
        Пример с числом 7:
        *******
        *    *
        *   *
        *  *
        * *
        *
        Необходимо написать программу для вывода
        вначале заполненного, а потом и пустого треугольника.*/
public class ex17_5 {
    public static void main(String[] args) {
        System.out.println("Ведите размер основания треугольника");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        for (int i = b; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print(System.lineSeparator());
        }
    }
}
 /*       System.out.println("Ведите размер основания треугольника");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++) {
                {
                    if (i == n || j == 1 || j == i) {
                        System.out.print('*');
                    }
                    else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.print(System.lineSeparator());
        }
    }
}*/