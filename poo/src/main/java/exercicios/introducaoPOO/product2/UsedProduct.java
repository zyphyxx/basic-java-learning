package exercicios.introducaoPOO.product2;

import java.time.LocalDate;

public class UsedProduct extends Product{

    private final LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }


// methods

    @Override
    public String priceTag() {
        return super.priceTag()+ " (Manufacture date: "+ manufactureDate+" )";
    }
}
