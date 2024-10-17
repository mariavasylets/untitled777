public class ComfortTaxi extends Taxi implements TaxiInterface {
    public ComfortTaxi(double pricePerMinute){
        super(pricePerMinute);
    }

    @Override
    public String checkAdditionalServices() {
        return "Із додаткового сервісу доступно: зарядний пристрій, Wi-Fi";
    }

    @Override
    public double calculateAdditionalCost() {
        return 50.0;
    }
}
