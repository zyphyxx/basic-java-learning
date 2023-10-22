package exercicios.colecoes.genericsDelimitados.aplication;

import exercicios.colecoes.genericsDelimitados.entities.Product;
import exercicios.colecoes.genericsDelimitados.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "C:\\MeusProjetos\\ESTUDOS\\POO\\poo\\src\\main\\resources\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String [] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Max:");
            System.out.println(x);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
