package ex15_1;

import java.util.Scanner;

public class ex15_1 {public static void main(String[] args) {
    /*1) У вас есть строка "Я тестирую замечательно. Что еще нужно?",
            Которую нужно ввести с клавиатуры в консоль.
    Необходимо при помощи только  метода next() класса Scanner
    (не используем метод nextLine())
    присвоить перемнным типа String следующие значения:
    string1 = Я
    string2 = тестирую
    string3 = замечательно
    string4 = Что еще нужно?
    Помимо string1, string2, string3, string4 новых переменных
    создавать нельзя.*/
    System.out.println("Введите строку \" Я тестирую замечательно. Что еще нужно?\"");
    Scanner a = new Scanner(System.in);
    String string1 = a.next();
    String string2 = a.next();
    String string3 = a.next();
    String string4 = a.next();
    System.out.printf(string1+ " " + string2 + " " + string3 + " " + string4 +" %s", "еще нужно?");
}
}

