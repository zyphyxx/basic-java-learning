package exercicios.introducaoPOO.product2;


public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    // methods

    public Double totalPrice() {
        // TODO: 16/10/2023
        return null;
    }

    @Override
    public String priceTag() {
        return super.priceTag() ;
    }

}
