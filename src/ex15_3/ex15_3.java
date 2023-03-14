package ex15_3;

import java.util.Scanner;

/*3)Пользователь вводит с клавиатуры свой год рождения.
На консол выводится информация о его возрасте.
(P.s пока не затрагиваем момент месяца рождения,
останавливаемся только на разнице годов. Если вам
вдруг понадобится преобразовать тип String в int,
то можете воспользоватьсятакой конструкцией Integer.parseInt(строка для преобразования).*/
public class ex15_3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("ВВедите год своего рождения.");
        int b = a.nextInt();
        int x = 2023 - b;
        System.out.println("Вам " + x + " лет");
    }
}

