package ex19.ex19_1;
/*1) Создать класс Computer c конструктором принимающим параметры
        Марка тип String, цена тип int, оперативная память тип int,
        и видеокарта тип int.
        Конструктор также выводит на консоль сообщение типа:
        "Создан PC.
        Имя = марка.
        Цена = цена.
        Видеокарта = объем видеокарты
        ОЗУ = Объем оперативной памяти."

        Все поля класса Computer должны быть приватными.
        Также создайте публичные методы для получения информации о полях класса Computer.
        А также методы для изменения его полей.

        Создайте один метод для получения всей информации о объекте класса Computer.

        В отдельном классе создайте объект класса компьютер, и выведите на экран его поля при использовании
        одного созданного выше метода класса.*/

public class Computer {
    private String model;
    private int pricе;
    private int memory;
    private int videoCard;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPricе() {
        return pricе;
    }

    public void setPricе(int pricе) {
        this.pricе = pricе;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    public Computer(String model, int pricе, int memory, int videoCard) {
    System.out.println("Создан РС");
    System.out.println("Имя = " + model);
    System.out.println("Цена = " + pricе);
    System.out.println("Видеокарта = " + videoCard);
    System.out.println("ОЗУ = "+ memory);
}
public void getInfo() {
    System.out.println(getModel());
    System.out.println(getPricе());
    System.out.println(getMemory());
    System.out.println(getVideoCard());
}
}