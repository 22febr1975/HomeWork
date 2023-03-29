package ex19.ex19_3;

public class main {
    public static void main(String[] args) {
        Converter abc = new Converter();
abc.ConvertToInt((byte) -123, (short) 12345, 123, 123456L, (char) 76, 2.14F, 88.9, "efd");
abc.ConvertToDouble((byte)128, (short)55678, 5546, 23456L, (char)53, 3.45F, 3.1425, "true");
System.out.println();
abc.ConvertToString((byte)-87, (short)34563, 2345, 8765L, (char) 56, true, 76.4F, 0.54, "sdfghj");
    }
}
