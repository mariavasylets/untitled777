public class BusinessTaxi extends Taxi implements TaxiInterface {
    public BusinessTaxi(double pricePerMinute){
        super(pricePerMinute);
    }

    @Override
    public String checkAdditionalServices() {
        return "Із додаткового сервісу доступно: зарядний пристрій, Wi-Fi, напої";
    }

    @Override
    public double calculateAdditionalCost() {
        return 100.0;
    }
}
