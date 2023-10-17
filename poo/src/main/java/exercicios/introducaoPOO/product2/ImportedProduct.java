package exercicios.introducaoPOO.product2;


public class ImportedProduct extends Product{

    private final Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    // methods

    public Double totalPrice() {
        // TODO: 16/10/2023

        return getPrice() + getCustomsFee();
    }

    @Override
    public String priceTag() {
        return super.priceTag()+" Customs fee: $ "+getCustomsFee() ;
    }

}
