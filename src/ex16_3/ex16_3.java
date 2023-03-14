package ex16_3;

import java.util.Scanner;

/*3)(Использовать операторы if-else-if)
        Пользоватьель вводит с клавиатуры числа:
        Если число равно 1, то выводин на консоль "Понедельник";
        Если число равно 2, то выводин на консоль "Вторник";
        Если число равно 3, то выводин на консоль "Среда";
        Если число равно 4, то выводин на консоль "Четверг";
        Если число равно 5, то выводин на консоль "Пятница";
        Если число равно 6, то выводин на консоль "Суббота";
        Если число равно 7, то выводин на консоль "Воскресенье";
        В противном случае выводим текст:
        "Лучше бы сегодня была пятница".*/
public class ex16_3 {
    public static void main(String[] args) {
        System.out.println("Какой день недели \n 1) Понедельник \n 2) Вторник \n 3) Среда \n 4) Четверг \n 5) Пятница \n 6) Суббота \n 7) Воскресенье \n Укажите номер");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        String day;
              switch (x) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day, Лучше бы сегодня была пятница.";
                break;
        }
        System.out.println("The day is " + day);
    }
}

