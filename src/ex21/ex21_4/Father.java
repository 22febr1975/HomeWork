package ex21.ex21_4;

public class Father {
    private String name;
    private int money;
    public String prod1;
    public int quantity1;
    public String prod2;
    public int quantity2;

    public Father(String name, int money, String prod1, int quantity1, String prod2, int quantity2) {
        this.name = name;
        this.money = money;
        this.prod1 = prod1;
        this.quantity1 = quantity1;
        this.prod2 = prod2;
        this.quantity2 = quantity2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getProd1() {
        return prod1;
    }

    public void setProd1(String prod1) {
        this.prod1 = prod1;
    }

    public int getQuantity1() {
        return quantity1;
    }

    public void setQuantity1(int quantity1) {
        this.quantity1 = quantity1;
    }

    public String getProd2() {
        return prod2;
    }

    public void setProd2(String prod2) {
        this.prod2 = prod2;
    }

    public int getQuantity2() {
        return quantity2;
    }

    public void setQuantity2(int quantity2) {
        this.quantity2 = quantity2;
    }

    public void pokup() throws NoMoney, NoDivision3, NoBeerTobacco {

            int sum=0;

        if (getProd1().equalsIgnoreCase("яблоко")){sum =  Produkt.apple.getCose()*getQuantity1();

        } if (getProd1().equalsIgnoreCase("картошка")){sum =  Produkt.potato.getCose()*getQuantity1();

        } if (getProd1().equalsIgnoreCase("молоко")){sum =  Produkt.milk.getCose()*getQuantity1();

        } if (getProd1().equalsIgnoreCase("пиво")){throw new NoBeerTobacco();
        } if (getProd1().equalsIgnoreCase("табак")){throw new NoBeerTobacco();
        }else if (getProd2().equalsIgnoreCase("яблоко")){sum = Produkt.apple.getCose() *getQuantity2();

        }else if (getProd2().equalsIgnoreCase("картошка")){sum = Produkt.potato.getCose()*getQuantity2();

        }else if (getProd2().equalsIgnoreCase("молоко")){sum = Produkt.milk.getCose()*getQuantity2();

        }else if (getProd2().equalsIgnoreCase("пиво")){throw new NoBeerTobacco();
        }else if (getProd2().equalsIgnoreCase("табак")){throw new NoBeerTobacco();}


if (getMoney()<sum){
        throw new NoMoney();
    }else if(getQuantity1()%3!=0){
        throw new NoDivision3();
    }else if(getQuantity2()%3!=0) {
        throw new NoDivision3();
    }
     System.out.println("Уважаемый " + getName()+" стоимость ваших покупок " + sum + "." + "Вы приобрели " + getProd1()+ " в количестве " + getQuantity1()+ "," + " и " + getProd2()+ " в количестве " + getQuantity2()+".");
                    }
    }

