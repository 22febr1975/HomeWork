package ex21.ex21_4;

public class NoBeerTobacco extends Exception{
    @Override
    public String getMessage() {
        return "Черезмерное употребление алкоголя вредно для здоровья. Курение вредит здоровью.";
    }
}
