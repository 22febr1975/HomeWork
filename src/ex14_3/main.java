package ex14_3;

public class main  {public static void main(String[] args) {
    String string1 = "This line that i want to cut, cause it is too long";
    String string2 = string1.substring(0,35);
    String string3 = string2.concat(" it is perfect");
    int x = string1.length();
    int y = string2.length();
    int z = string3.length();
    System.out.println(string1);
    System.out.println(x);
    System.out.println(string2);
    System.out.println(y);
    System.out.println(string3);
    System.out.println(z);
}
}
