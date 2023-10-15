package exercicios.introducaoPOO.employee2;

public class OutsourcedEmployee extends Employee {
    // fields
    private Double additionalCharge;

    // constructor
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    //getters and setters
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    // methods
    @Override
    public Double payment() {
        return super.payment() + (additionalCharge * 1.1);
    }
}
