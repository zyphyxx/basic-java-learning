package exercicios.introducaoPOO.fee.entities;

public class TaxPayer {
    private String name;
    private Double anualIncome;

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public Double tax() {
        double valor = 0;
        if (anualIncome <= 20000.00) {
            valor = anualIncome * 0.15;

        } else if (anualIncome > 20000.00) {
            valor = anualIncome * 0.24;

        }

        return valor;
    }
}
