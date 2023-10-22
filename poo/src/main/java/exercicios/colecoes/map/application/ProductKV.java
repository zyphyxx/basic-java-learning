package exercicios.colecoes.map.application;

import exercicios.colecoes.map.entities.Product;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ProductKV {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

       Map<Product, Double> stock = new HashMap<>();

       Product p1 = new Product("TV", 900.00);
       Product p2 = new Product("Notebook", 1200.00);
       Product p3 = new Product("Tablet", 400.00);

       stock.put(p1,10000.0);
       stock.put(p2,20000.0);
       stock.put(p3,15000.0);

       Product ps = new Product("TV", 900.00);

        System.out.println("Contains 'ps' key: "+ stock.containsKey(ps));

    }
}
