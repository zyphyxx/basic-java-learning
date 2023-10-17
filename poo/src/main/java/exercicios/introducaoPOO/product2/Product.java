package exercicios.introducaoPOO.product2;

public class Product {

    private String Name;
    private Double price;

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

    public void setPrice(Double price) {
        this.price = price;
    }
    // methods
    public String priceTag(){
        // TODO: 16/10/2023  
        return null;
    }
}
