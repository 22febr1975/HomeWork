package ex18_1;
/*1) Написать метод, принимающий в качестве параметров два числа,
        который будет выводить на консоль сумму этих двух чисел.

        Написать второй метод, который будет возвращать сумму двух чисел,
        которые он будет принимать в параметре метода.

        Вывести на консоль сумму двух любых чисел при помощи первого и второго метода.*/
public class ex18_1_1 {
    public int number;
    public int plus;

    public int getNumber() {
        return number;
    }

    public void setPlus(int number1) {
        this.number = number1;
    }
    public int plus (int number1, int number2){
        return number1 + number2;
    }
}
