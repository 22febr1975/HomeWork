package ex15_2;

import java.util.Scanner;
public class ex15_2 {
    public static void main(String[] args) {
        /*2)Пользователь вводит с клавиатуры три целочисленных значения
        На экран выводится информация можно ли из этих сторон
        построить треугольник.*/
        Scanner a = new Scanner(System.in);
        System.out.println("ВВедите длину сторон треугольника.");
        int x = a.nextInt();
        int y = a.nextInt();
        int z = a.nextInt();
       /* System.out.println(x + y + z);*/
       boolean b = x + y>z&&x + z>y&&y + z>x;
       /*System.out.println(b);*/
if (b = true){
    System.out.println("Треугольник существует.");
        } else
        System.out.println("Треугрльник не существует.");
    }
}
