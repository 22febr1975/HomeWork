package ex18_3;

import java.util.Scanner;

/*3)Используя рекурсию напишите метод, который будет выводить введенное число в обратном порядке, так чтобы каждая
        цифра писалась два раза, после ставился пробел, и вторая цифра тоже писалась два раза и после ставился пробел...
        Пример: вы вводите 563
        вывод будет следующий 33 66 55*/
public class rekurs {
public static void rekurs(int x){
    if (x < 10){
    System.out.print(" " + x+x);
    return;}
    else {
        System.out.print(" " + x%10+x%10);
        rekurs(x/10);
    }
}

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner a = new Scanner(System.in);
        int t = a.nextInt();
        rekurs(t);
    }
}
