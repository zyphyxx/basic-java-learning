package exercicios.introducaoPOO.rental;

public class Valor extends Model {

    private double priceHour;
    private double pricePerDay;

    public Valor(String carModel, double priceHour, double pricePerDay) {
        super(carModel);
        this.priceHour = priceHour;
        this.pricePerDay = pricePerDay;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(double priceHour) {
        this.priceHour = priceHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void basicPayment(){}

    public double tax(){
        return 1;
    }

    public double totalPayment(){
        return 1;
    }

}
