package exercicios.introducaoPOO.fee.entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double valor = getAnualIncome() * 0.16;
        if (numberOfEmployees > 10){
            valor = getAnualIncome() * 0.14;
        }
        return valor;

    }
}
