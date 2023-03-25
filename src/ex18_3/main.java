package ex18_3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner a = new Scanner(System.in);
        int t = a.nextInt(), reversed = 0;

                for(;t != 0; t /= 10) {
                    int digit = t % 10;
                    reversed = reversed * 10 + digit;
                String b = Integer.toString(digit);
                              System.out.println(b);}
                                System.out.println("Реверс числа: " + reversed);
            }
        }

