package ex19.ex19_4;
/*4) Создать класс калькулятор.
        В нем создать методы:
        summ, minus, multiply, division.
        Сложение, вычитание, умножение и деление соответственно.
        Каждый метод принимает в качестве параметров два значения типа double.
        И выводит в консоль результат действия.

        Также в классе есть метод старт. Который выводит сообщение в консоль, что
        калькулятор запущен. И предлагает ввести действие в вашей консоли.

        Калькулятор должен принимать только следующие типы действий:
        2+4;    - пример синтаксиса сложения;
        5-6;    - пример синтаксиса вычитания;
        25*3;   - пример синтаксиса умножения;
        34/3;   - пример синтаксиса деления;
        После ввода действия на консоль выводится ответ этого действия.
        И после снова выводится сообщение о предложении ввести действие.

        в случае ввода другого синтаксисана консоль возвращается сообщение:
        "Введите корректное действие".
        И после снова выводится сообщение о предложении ввести действие.

        Программа закрывается после ввода команды Stop.
        Перед закрытием на консоль должно выводится сообщение:
        "Калькулятор закрыт".*/
import java.util.Scanner;

public class Calkul {
    public String stop;
    public double num1;
    public double num2;
    public char operation;
    static Scanner scanner = new Scanner(System.in);

    /*   public static void main(String[] args) {
           double num1 = getDouble();
           double num2 = getDouble();
           char operation = getOperation();
           double result = calc(num1,num2,operation);
           System.out.println("Результат операции: "+result);
       }*/
    public String Start() {
        System.out.println("Калькулятор запущен");
                return "";
    }
    public static double getDouble() {

        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getDouble();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;


    }

}
