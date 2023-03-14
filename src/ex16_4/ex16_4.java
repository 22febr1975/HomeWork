package ex16_4;

import java.util.Scanner;

/*4)Написать программу, которая будет считывать введенные пользователем
        слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
        пока пользователь не введет с клавитуры слово STOP.
        Все слова введенные до этого должны отобразится в консоли
        одним предложением.*/
public class ex16_4 {
    public static void main(String[] args) {
        String b = "";
        for (int i = 1; i > 0; i++) {
            System.out.println("ВВедите слово");
            Scanner a = new Scanner(System.in);
            String x = a.nextLine();
            b = b + " " + x;
            String d = "stop";
            if (x.equalsIgnoreCase(d)) {
                break;
            }else {System.out.println(b);}
        }
        }
    }


