package ex14_4;

public class main {public static void main(String[] args) {
    String string = "Testing, is my favourite job";
    String string1 = string.substring(0,6);
    String string2 = string.substring(9,11);
    String string3 = string.substring(12,14);
    String string4 = string.substring(15,24);
    String string5 = string.substring(25,28);
    int x = string1.length();
    int y = string2.length();
    int z = string3.length();
    int t = string4.length();
    int w = string5.length();
    System.out.println("Cлово1 = " + string1 + ", " + "Длина этого слова = " + x);
    System.out.println("Cлово2 = " + string2 + ", " + "Длина этого слова = " + y);
    System.out.println("Cлово3 = " + string3 + ", " + "Длина этого слова = " + z);
    System.out.println("Cлово4 = " + string4 + ", " + "Длина этого слова = " + t);
    System.out.println("Cлово5 = " + string5 + ", " + "Длина этого слова = " + w);
    boolean a = x > y;
    boolean b = a&&x>z&&x>t&&x>w;
    System.out.println("Cлово1 длиннее остальных - " + b);
}
}
