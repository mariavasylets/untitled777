public class Person {
    private String name;
    private int birthYear;
    private double balance;
    private int promoCode;
    private final int CORRECT_PROMO = 1212;

    public Person(String name, int birthYear, double balance, int promoCode){
        this.name=name;
        this.birthYear=birthYear;
        this.balance=balance;
        this.promoCode=promoCode;
    }

    public int age(){
        int year = 2024;
        return year - birthYear;
    }

    public double discount(){
        if (promoCode==CORRECT_PROMO){
            return 0.1;
        }
        else {
            return 0.0;
        }
    }

    public boolean isRegistred(){
        return age()>=16;
    }

    public int getPromoCode(){
        return promoCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
