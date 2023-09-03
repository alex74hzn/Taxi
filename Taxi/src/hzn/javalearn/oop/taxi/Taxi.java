package hzn.javalearn.oop.taxi;

public class Taxi {
    private Levels level;

    private double pricePerKm;
    private double total;
    public String message = "";


    public Taxi() {

    }
    public Levels getLevel() {
        return level;
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(double price) {
        this.pricePerKm = price;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void drive(double distance){

    }

    public String deliver(){
        return "Приехали!";
    }
}