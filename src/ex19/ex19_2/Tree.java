package ex19.ex19_2;
/*
2) Создать класс Tree с перегруженными конструкторами.
        В классе есть Tree есть поля:
        String type; int height, int coutOfsticks, String colour;

        Конструктор1 принимающий в параметры String type; int height
        и присваивающий значение полям coutOfsticks значение 13,
        colour "Зеленый".

        Конструктор2 принимающий в параметры int height, int coutOfsticks,
        String colour и присваивающий значение полю type "пихта".

        Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
        сolour = "Желтый".

        Конструктор4 который принимает в параметры String type,
        и вызывает внутри себя конструктор 3.

        Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.
*/
public class Tree {
public String type;
public int height;
public int coutOfsticks;
public String colour;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCoutOfsticks() {
        return coutOfsticks;
    }

    public void setCoutOfsticks(int coutOfsticks) {
        this.coutOfsticks = coutOfsticks;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Tree(String type, int height){
    this.type=type;
    this.height=height;
    this.coutOfsticks=13;
    this.colour="зеленый";
    }
    public Tree(int height, int coutOfsticks, String colour){
        this.type="пихта";
        this.height=height;
        this.coutOfsticks=coutOfsticks;
        this.colour=colour;
        }
    public Tree(){
        this.height=350;
        this.coutOfsticks=29;
        this.colour="Желтый";
    }
    public Tree(String type){
    this();
        this.type=type;
         }
    public void getInfo() {
        System.out.println(getType());
        System.out.println(getHeight());
        System.out.println(getCoutOfsticks());
        System.out.println(getColour());
    }
}
