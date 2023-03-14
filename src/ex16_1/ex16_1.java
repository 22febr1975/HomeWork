package ex16_1;

import java.util.Scanner;

/*1)Используя оператор switch написать программу, которая выводит на
        консоль ссылку для скачивания программы.
        Из выбора программ взять: IntelliJ IDEA, Git, Java.
        Из выбора ОС взять: Linux, macOS, Windows.
        Программа должна спросить пользователя какая программа ему интересна,
        также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
        Если программа с таким названием не существует выводит сообщение в консоль, о том
        что такой программы не существует.
        Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том
        что такой ОС не существует.*/
public class ex16_1 {
    public static void main(String[] args) {
        System.out.println("Какая программа Вам интересна? \n 1) IntelliJ IDEA \n 2) Git \n 3) Java \n Укажите номер");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        System.out.println("Какую ОС используете? \n 1) Linux \n 2) macOS \n 3) Windows \n Укажите номер");
        Scanner b = new Scanner(System.in);
        int y = b.nextInt();
        String d;
        String c;
        // Выбор программы
        switch (x) {
            case 1:
                d = "IntelliJ IDEA";
                break;
            case 2:
                d = " Git";
                break;
            case 3:
                d = " Java";
                break;
            default:
                d = " Invalid program";
                break;
        }
                // Выбор ОС
            switch (y) {
                case 1:
                    c = "Linux";
                    break;
                case 2:
                    c = "macOS";
                    break;
                case 3:
                    c = "Windows";
                    break;
                default:
                    c = "Invalid OS";
                    break;
            }
            System.out.println("Ваша ссылка для ОС " + c + d);
        }
    }