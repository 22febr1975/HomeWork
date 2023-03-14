package ex14_2;

public class main {public static void main(String[] args) {
    double chislitel = 7.0;
    double znamenatel =5.0;
    int x = (int) (chislitel/znamenatel);
    int y = (int) (chislitel%znamenatel);
    System.out.println("Целая часть равна " + x);
    System.out.println("Остаток от деления " + y);
    System.out.println("Знаменатель равен " + (int) (znamenatel));
}
}
