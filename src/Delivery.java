public class Delivery extends ProjectDo{
    public Delivery(double pricePerMinute) {
        super(pricePerMinute);
    }

    @Override
    public double calculateCost(int deliveryTime, Person person) {
        double deliveryCost = pricePerMinute * deliveryTime;
        double discount = person.discount();
        return deliveryCost - (deliveryCost * discount);
    }

    public double calculateOrder(double orderPrice){
        return orderPrice + orderPrice*0.03;
    }

}
