package ex16_2;

import java.util.Scanner;

/*2)При помощи цикла while выполнить реализацию следующего алгоритма.
        Пользователь вводит строку с клавиатуры. Программа должна вывести на
        экран сколько символов "a", присутсвует в данной строке.*/
public class ex16_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("ВВедите предложение.");
        String b = a.nextLine();
        int countNulls=0, countOnes = 0;
        for (char element : b.toCharArray()){
            if (element == 'a') countNulls++;
            if (element == 'A') countOnes++;
        }System.out.println("Символ 'a' встречается в данной строке встечается " + countNulls);
        System.out.println("Символ 'A' встречается в данной строке встечается " + countOnes);
    }
}
