package ex20;

public class Human {
    private String name;
    private boolean card;
    private int age;
    private Tovar tovar;

    public Human(String name, boolean card, int age) {
        this.name = name;
        this.card = card;
        this.age = age;
        this.tovar = tovar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getCard() {
        return card;
    }

    public void setCard(boolean card) {
        this.card = card;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tovar getTovar() {
        return tovar;
    }

    public void setTovar(Tovar tovar) {
        this.tovar = tovar;
    }
}
