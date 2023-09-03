package hzn.javalearn.oop.taxi;

public class BasicTaxi extends Taxi{
    public BasicTaxi() {
        this.setLevel(Levels.BASIC);
        this.setPricePerKm(1.5f);
    }
    @Override
    public void drive(double distance){
        double total = getPricePerKm() * distance;
        message += this.getLevel().toString();
        message += "\nЦена за поездку " + String.format("%5.2f",total);
        setTotal(total);
    }
    public String deliver(){
        return super.deliver();
    }
}