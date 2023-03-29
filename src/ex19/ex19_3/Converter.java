package ex19.ex19_3;
/*3) Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
        метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
        convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
        converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).
        У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
        А также только один метод геттер для получения информации о названии данного конвертра.*/

import java.util.Scanner;

public class Converter {
    static Scanner scanner = new Scanner(System.in);
   public byte b;
    public short s;
    public int i;
    public long l;
    public char c;
    public float f;
    public double d;
    public String ss;
    public boolean bb;

       public void ConvertToInt(byte b, short s, int i, long l, char c, float f, double d, String ss){
           boolean w;
           if (scanner.hasNext()){w = scanner.hasNextBoolean();
               System.out.println("Вы ввели тип boolean.");}
        int a = b;
        System.out.println(a);
        int a1 = s;
        System.out.println(a1);
           int a2 =i;
           System.out.println(a2);
           int a3 = (int) l;
           System.out.println(a3);
           int a4 = c;
           System.out.println(a4);
           int a5 = (int) f;
           System.out.println(a5);
           int a6 = (int) d;
           System.out.println(a6);
           try
           {
           int a7 = Integer.parseInt(ss.trim());
           System.out.println(a7);
           }
           catch (NumberFormatException nfe)
           {
               System.out.println("NumberFormatException: " + nfe.getMessage());
           }
       }
    public void ConvertToDouble(byte b, short s, int i, long l, char c, float f, double d, String ss){
        boolean w;
        if (scanner.hasNext()){w = scanner.hasNextBoolean();
                System.out.println("Вы ввели тип boolean.");}
        double a = b;
        System.out.println(a);
        double a1 = s;
        System.out.println(a1);
        double a2 =i;
        System.out.println(a2);
        double a3 = (int) l;
        System.out.println(a3);
        double a4 = c;
        System.out.println(a4);
        double a5 = (int) f;
        System.out.println(a5);
        double a6 = (int) d;
        System.out.println(a6);
        try
        {
            double a7 = Integer.parseInt(ss.trim());
            System.out.println(a7);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
    public void ConvertToString(byte b, short s, int i, long l, char c, boolean bb, float f, double d, String ss){
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.println(bb);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ss);
           }
       }




