package ex15_5;

import java.util.Date;
import java.util.Scanner;

/*5)Написать алгоритм, где у пользователя просят ввести
        спецификатор формата для нынешнего времени либо даты.
        И в зависимости от ввода этого спецификатора на консоль
        будет выводится дата либо время в указанном формате.*/
public class ex15_5 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Выберите формат для нынешнего времени либо даты с помощью букв \n 1 DD.ММ.YY, \n 2 YY.MM.DD, \n 3 YY.DD.MM, \n 4 hh.mm.ss");
    Scanner x = new Scanner(System.in);
    int y = x.nextInt();
    switch (y) {
        case 1:
            System.out.printf("Сегодняшняя дата в выбранном формате %1$td:%1$tm:%1$ty", date);
            break;
        case 2:
            System.out.printf("Сегодняшняя дата в выбранном формате %1$ty:%1$tm:%1$td", date);
            break;
        case 3:
            System.out.printf("Сегодняшняя дата в выбранном формате %1$ty:%1$td:%1$tm", date);
            break;
        case 4:
            System.out.printf("Сегодняшняя дата в выбранном формате %1$tH:%1$tH:%1$tS", date);
            break;
            }
   }
}

