package ex18_4;
/*4) Написать перегруженный метод, который может:
        - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
        "Я пустой".
        - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
        - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
        через пробел.
        - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
        массива.
        - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
        "Ваше сообщение - "%%%%%%%%", ваше число -  $",
        где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/

import java.util.Arrays;

public class Peregrus {
    public static void peregrus(){
        System.out.println("Я пустой");
    };

    public static void peregrus(String string){System.out.println(string);
    }
    public static void peregrus(String[] b){
        System.out.println(Arrays.toString(b));

    }
    public static void peregrus(int[] c){
       System.out.println(Arrays.toString(c));
        int sum = 0;
        for (int i=0; i<c.length; i++){sum = sum + c[i];}
        System.out.println(sum);

    }
    public static void peregrus(int y, String d){
        System.out.println("Ваше сообщение - "+ d + ", ваше число - " + y);
    }
}
