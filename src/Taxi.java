public class Taxi extends ProjectDo{
    public Taxi(double pricePerMinute){
        super(pricePerMinute);
    }

    @Override
    public double calculateCost(int rideTime, Person person) {
        double rideCost = pricePerMinute * rideTime;
        double discont = person.discount();
        double result = rideCost - (rideCost * discont);
        return result;
    }
}
