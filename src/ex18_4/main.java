package ex18_4;

import static ex18_4.Peregrus.peregrus;

public class main {
    public static void main(String[] args){
        peregrus();
        System.out.println();

    peregrus("Здоавствуйте");
    peregrus(new String[]{"Петя", "Вася", "Оля"});
    peregrus(new int[]{1, 2, 3, 4, 5});
    peregrus(10, "Ок");
    }
}
