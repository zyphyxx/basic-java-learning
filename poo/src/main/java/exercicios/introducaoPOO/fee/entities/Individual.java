package exercicios.introducaoPOO.fee.entities;

public class Individual extends TaxPayer{

     private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        healthExpenditures /= 2;
        return super.tax() - healthExpenditures;
    }
}
