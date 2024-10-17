import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "1. McDonald's", "2. Sushi&Pizza", "3. CheeseBakery", "4. La Cafe", "5. Salalat");
        System.out.println("Вітаю! Введіть ваші дані для входу: ім'я, рік народження, баланс на карті та промокод (якщо немає введіть 0)");
        Person person = new Person(sc.nextLine(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
        if (!person.isRegistred()){
            System.out.println("Вам менше 16 років. Реєстрація неможлива. Програма зупинена.");
            return;
        }
        System.out.println("Вас зареєстровано");
        System.out.println("Що бажаєте замовити? 1.Доставка їжі; 2.Таксі; 3.Таксі комфорт класу; 4.Таксі бізнес класу");
        int choice = sc.nextInt();
        double calculate = 0.0;
        switch (choice){
            case 1:
                Delivery delivery = new Delivery(3);
                System.out.println("Оберіть заклад:");
                for (String i: list){
                    System.out.println(i);
                }
                String cafe = list.get(sc.nextInt()-1);
                System.out.println("Введіть час доставки:");
                double cCost = delivery.calculateCost(sc.nextInt(), person);
                System.out.println("Сума доставки:"+cCost);
                System.out.println("Введіть замовлення:");
                String order;
                sc.nextLine();
                order = sc.nextLine();
                System.out.println("Введіть ціну:");
                double cOrder = delivery.calculateOrder(sc.nextDouble());
                System.out.println("Ви обрали:");
                System.out.println("Заклад: "+cafe+". Замовлення: "+order+". Сума замовлення: "+cOrder);
                calculate = cCost + cOrder;
                break;
            case 2:
                Taxi taxi = new Taxi(3.5);
                System.out.println("Введіть час поїздки:");
                calculate = taxi.calculateCost(sc.nextInt(), person);
                System.out.println("Сума поїздки: "+calculate);
                break;
            case 3:
                ComfortTaxi comfortTaxi = new ComfortTaxi(4.5);
                System.out.println("Введіть час поїздки:");
                calculate = comfortTaxi.calculateCost(sc.nextInt(), person) + comfortTaxi.calculateAdditionalCost();
                System.out.println("Сума поїздки: "+calculate);
                System.out.println(comfortTaxi.checkAdditionalServices());
                break;
            case 4:
                BusinessTaxi businessTaxi = new BusinessTaxi(5.5);
                System.out.println("Введіть час поїздки:");
                calculate = businessTaxi.calculateCost(sc.nextInt(), person) + businessTaxi.calculateAdditionalCost();
                System.out.println("Сума поїздки: "+calculate);
                System.out.println(businessTaxi.checkAdditionalServices());
                break;
            default:
                System.out.println("Не існуючий вибір, будь ласка повторіть спробу і оберіть щось із переліку");
                return;

        }
        if (person.getBalance()<=(calculate)){
            System.out.println("У Вас на рахунку недостатньо коштів. Замовити таксі неможливо");
            return;
        }else{
            person.setBalance(person.getBalance()-(calculate));
            System.out.println("Оплата пройшла успішно, у вас на рахунку залишилось:"+person.getBalance());
        }





    }
}