package ex19.ex19_4;

import java.util.Scanner;

import static ex19.ex19_4.Calkul.*;

public class main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 1; i > 0; i++) {
            Calkul cal = new Calkul();
            cal.Start();
            double num1 = getDouble();
            double num2 = getDouble();
            char operation = getOperation();
            double result = calc(num1, num2, operation);
            System.out.println("Результат операции: " + result);
            System.out.println("Хотите ещё");
            Scanner a = new Scanner(System.in);
            String x = a.nextLine();
            String d = "stop";
            if (x.equalsIgnoreCase(d)) {
                break;
            }
        }
    }
}