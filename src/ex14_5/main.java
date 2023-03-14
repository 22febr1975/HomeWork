package ex14_5;
public class main {public static void main(String[] args) {
String str = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
    int countNulls=0, countOnes = 0;
    for (char element : str.toCharArray()){
        if (element == 'a') countNulls++;
        if (element == 'A') countOnes++;
    }System.out.println("Символ 'a' встречается в данной строке встечается " + countNulls);
    System.out.println("Символ 'A' встречается в данной строке встечается " + countOnes);
        }
    }

