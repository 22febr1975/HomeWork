package ex20;
/*Написать метод, который будет выводить на консоль информацию о названии магазина в котором происходит покупка,
        о стоимости данной покупки. Об имени продавца, который продает товар, об имени покупателя, который покупает товар,
        название товара и возраст покупателя.

        Продавец может быть честным или нет.
        Если он честный и товар является алкогольным, то тогда он не продаст данный товар покупателю младше 18 лет.

        Если он нечестный и товар является алкогольным, то тогда он продаст данный товар покупателю младше 18 лет.

        Если у покупателя имеется скидочная карта, то цена покупки будет снижена на 10 процентов.

        Все поля классов должны быть приватными.

        Метод покупки принадлежит самому магазину.

        Покупатель и продавец должны иметь один общий абстрактный класс, от которого они будут наследоваться.
        В этом абстрактном классе добавьте абстрактный метод role.
        Продавец пусть его реализует таким образом:
        System.out.println("Я продавец");
        Покупатель следующим:
        System.out.println("Я покупатель");

        Свойство честности принадлежит только продавцу.

        Только покупатель может иметь скидочную карту.

        Также метод, который необходимо реализовать для решения данной задачи,
        должен имплементировать функциональный интерфейс с таким же методом.

        По итогу в классе Main должна быть прописана примерно такая логика:
        Shop shop = new Shop();
        shop.returnCost();

        Конечно же с правильно заданными параметрами метода, и аргументами конструкторов.

        А на консоль должно выводиться сообщение примерно следующее:
        Уважаемый {Имя покупателя}, продавец {Имя продавца} нашего магазина "{Название магазина}",
        продаст вам этот товар {Название товара},
        в них есть алкогольная продукция, а ваш возраст {Возраст покупателя}.
        Стоимость вашей покупки равна {Стоимость покупки}
        Вот вам скидка

        P.s. Сообщение для вывода напишите такое, какое пожелаете.
        Это просто пример. Плюс оно должно меняться в зависимости от параметра объектов,
        которые будут приниматься в метод.*/
public class main {
    public static void main(String[] args) {
Market market = new Market("ATB");
market.sale(new Tovar("масло", 81.5, 2), new Human("VASYA", true, 17), new Salesman("LUDA", true));
    }
}
