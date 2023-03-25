package ex18_5;

import java.awt.*;
import java.util.Date;
public class main {
    public static void main(String[] args) {
        Date date = new Date();
        Conspekt conspekt = new Conspekt();
        conspekt.name="Petiya";
        conspekt.page=200;
        conspekt.data = 2023;
        conspekt.cvet=Color.white;
        conspekt.nameUniver="Shevchenko";
        System.out.println(conspekt.getName());
        System.out.println(conspekt.getPage());
        System.out.println(conspekt.getData());
        System.out.println(conspekt.getColor());
        System.out.println(conspekt.getNameUniver());
conspekt.setName("Vasiya");
conspekt.setPage(123);
conspekt.setData(2023);
conspekt.setCvet(Color.white);
conspekt.setNameUniver("Shevcheko");
        System.out.println(conspekt.name);
        System.out.println(conspekt.page);
        System.out.println(conspekt.data);
        System.out.println(conspekt.cvet);
        System.out.println(conspekt.nameUniver);
    }
}