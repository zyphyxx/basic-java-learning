package exercicios.introducaoPOO.product2;


public class Product {

    private String Name;
    private final Double price;

    public Product(String name, Double price) {
        Name = name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return price;
    }

    // methods
    public String priceTag(){
        // TODO: 16/10/2023
        return getName()+" $ "+getPrice();
    }
}
