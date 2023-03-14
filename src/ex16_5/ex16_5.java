package ex16_5;

import java.util.Scanner;

/*5)Написать программу в которой пользователь вводит с клавиатуры число,
        а программа определяет, является она полиндромом или нет.
        И выводит данную информацию на экран.*/
public class ex16_5 {
    public static boolean isPalindrome(int num)
    {
     int n = num;
     int rev = 0;
    while (n > 0) {
        int r = n % 10;
        rev = rev * 10 + r;
        n = n / 10;
        }
    return (num == rev);
    }

    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

