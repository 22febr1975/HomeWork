package ex16_6;

import java.util.Scanner;

/*6)Написать проограмму, условно для склада приема металла. Представим, что склад
        может хранить определенный вес металла. Пользователь вводит с
        клавиатуры вес, который может хранится на складе. Дальше пользователь вводит
        с клавиатуры вес, который условно собирается сдать на склад пользователь.
        Программа должна после каждой сдачи металла показывать сколько веса еще может принять
        склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
        то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
        Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает
        о невозможности приемки такого малого веса. Программа завершается, когда
        место на складе закончилось.*/
public class ex16_6 {
    public static void main(String[] args) {
        System.out.println("Введите максимальный вес металла для хранения на складе");
        Scanner a = new Scanner(System.in);
       int x = a.nextInt();
       int y = 0;
       while (y<=x){
          if ((x-y)==0){
              break;
          }
           System.out.println("Сколько металла собираетесь сдать");
       Scanner b = new Scanner(System.in);
       int z = b.nextInt();
       if (z>=5) {
           if (y + z > x) {
               System.out.println("Такое колличетво металла не поместится");
               System.out.println("Осталось для металла места " + (x - y));
               continue;
           }
       }else { y -= z; System.out.println("Минимальная сдача металла 5");}
       y += z;
       System.out.println("Осталось для металла места " + (x-y));

       }
       }


    }
