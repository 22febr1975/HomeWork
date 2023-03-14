package ex15_4;

import java.util.Scanner;

/*4)Вывести следующие сообщения в отформатированном виде (необходимо добавить спецификаторы формата):
        б) Строка: Число {X} больше {Y}, и это {True/False}
        Для аргументов создаем отдельно переменные.
        Вместо {X},{Y},{True/False} вставляем необходимые спецификаторы формата.
        Вывод: Число 5 болшье 7, и это false.*/
public class ex15_4_b {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("ВВедите два числа для сранения.");
        int x = a.nextInt();
        int y = a.nextInt();
        if (x>y) {
            System.out.println("Число " + x + "больше " + y + "и это true");
        } else {System.out.println("false");}
    }
}
