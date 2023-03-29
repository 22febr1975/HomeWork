package ex20;

public class Tovar {
private String name;
private double cost;
private int type;

    public Tovar(String name, double cost, int type) {
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
