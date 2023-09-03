package hzn.javalearn.oop.taxi;

public class VipTaxi extends Taxi{
    private double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public VipTaxi() {
        this.setLevel(Levels.VIP);
        this.setPricePerKm(3.7f);
        this.discount = 5;
    }
    public String displayDiscount(){
        return "Вам скидка " + this.discount + "%";
    }
    @Override
    public void drive(double distance){
        message += this.getLevel().toString();
        message += '\n' + displayDiscount();
        double total = getPricePerKm() * distance;
        message += "\nЦена за поездку " + String.format("%5.2f",total);
        total = total - total  / 100 * discount;
        setTotal(total);
    }
    @Override
    public String deliver(){
        String message = "Вы комфортно добрались до места назначения!";
        return message;
    }
}