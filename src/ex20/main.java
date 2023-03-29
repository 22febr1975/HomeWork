package ex20;

public class main {
    public static void main(String[] args) {
Market market = new Market("ATB");
market.sale(new Tovar("масло", 81.5, 2), new Human("VASYA", true, 17), new Salesman("LUDA", true));
    }
}
