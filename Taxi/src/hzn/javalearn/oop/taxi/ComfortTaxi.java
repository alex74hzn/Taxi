package hzn.javalearn.oop.taxi;

public class ComfortTaxi extends Taxi{
    public ComfortTaxi() {
        this.setLevel(Levels.COMFORT);
        this.setPricePerKm(2.3f);
    }
    public String displayDiscount(){
        return "В следующий раз у Вас будет скидка!";
    }
    @Override
    public void drive(double distance){
        message += this.getLevel().toString();
        message += '\n' + displayDiscount();
        double total = getPricePerKm() * distance;
        message += "\nЦена за поездку " + String.format("%5.2f",total);

        setTotal(total);
    }
    @Override
    public String deliver(){
        return "Ну, вот мы и на месте!";
    }
}