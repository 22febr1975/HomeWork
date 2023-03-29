package ex20;

public class Market {
    private String name;

    public Market(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sale(Tovar tovar, Human human, Salesman salesman){
        double x = tovar.getCost();
        double y = x*9/10;
        double z = x-y;
        if (tovar.getType() == 1){
if (salesman.getStatus() == true) {
    if (human.getAge() > 18) {
        if (human.getCard() == true) {
            System.out.println("Уважаемый " + human.getName() + ", " + "продавец " + salesman.getName() + " нашего магазина " + getName() + ", " +
                    "продаст вам этот товар " + tovar.getName() + ", " +
                    "в них есть алкогольная продукция, а ваш возраст" + human.getAge() + "." +
                    "Стоимость вашей покупки равна " + x +
                    "Вот вам скидка "+ z +" С Вас " + y);
        } else {
            System.out.println("Уважаемый" + human.getName() + ", " + "продавец " + salesman.getName() + " нашего магазина " + getName() + ", " +
                    "продаст вам этот товар " + tovar.getName() + ", " +
                    "в них есть алкогольная продукция, а ваш возраст" + human.getAge() + "." +
                    "Стоимость вашей покупки равна " + x);
        }
    }else {System.out.println("Уважаемый " + human.getName() + ", " + "продавец " + salesman.getName() + " нашего магазина " + getName() + ", " +
            "не продаст вам этот товар " + tovar.getName() + ", " +
            "в них есть алкогольная продукция, а ваш возраст" + human.getAge() + ".");}
}else {if (human.getCard() == true) {
    System.out.println("Уважаемый " + human.getName() + ", " + "продавец " + salesman.getName() + " нашего магазина " + getName() + ", " +
            "продаст вам этот товар " + tovar.getName() + ", " +
            "в них есть алкогольная продукция, а ваш возраст" + human.getAge() + "." +
            "Стоимость вашей покупки равна " + x +
            "Вот вам скидка " + z+" С Вас " + y);
} else {
    System.out.println("Уважаемый " + human.getName() + ", " + "продавец " + salesman.getName() + " нашего магазина " + getName() + ", " +
            "продаст вам этот товар " + tovar.getName() + ", " +
            "в них есть алкогольная продукция, а ваш возраст" + human.getAge() + "." +
            "Стоимость вашей покупки равна " + x);
};}
        }else {if (human.getCard() == true) {
            System.out.println("Уважаемый " + human.getName() + ", " + "продавец " + salesman.getName() + " нашего магазина " + getName() + ", " +
                    "продаст вам этот товар " + tovar.getName() + ", " +
                    "в них нету алкогольной продукции, а ваш возраст " + human.getAge() + "." +
                    " Стоимость вашей покупки равна " + x +
                    " Вот вам скидка "+ z+" С Вас " + y);
        } else {
            System.out.println("Уважаемый " + human.getName() + ", " + "продавец " + salesman.getName() + " нашего магазина " + getName() + ", " +
                    "продаст вам этот товар " + tovar.getName() + ", " +
                    "в них нету алкогольной продукции, а ваш возраст" + human.getAge() + "." +
                    "Стоимость вашей покупки равна " + x);
        };}
    }
}
