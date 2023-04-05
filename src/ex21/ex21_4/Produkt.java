package ex21.ex21_4;

public enum Produkt {apple("Яблоко", 10),potato("Картошка", 8),milk("Молоко", 25),beer("Пиво", 25),tobacco("Тобак", 50);
String name;
int cose;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCose() {
        return cose;
    }

    public void setCose(int cose) {
        this.cose = cose;
    }

    Produkt(String name, int cose) {
        this.name = name;
        this.cose = cose;
    }
}
