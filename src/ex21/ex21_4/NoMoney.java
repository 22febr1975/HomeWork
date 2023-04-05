package ex21.ex21_4;

public class NoMoney extends Exception{
    @Override
    public String getMessage() {
        return "У Вас не столько денег";
    }
}
