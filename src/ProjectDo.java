public abstract class ProjectDo {
    protected double pricePerMinute;

    public ProjectDo(double pricePerMinute){
        this.pricePerMinute =pricePerMinute;
    }

    public abstract double calculateCost(int time, Person person);

}
