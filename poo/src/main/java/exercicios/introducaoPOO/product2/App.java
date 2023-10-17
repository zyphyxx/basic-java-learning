package exercicios.introducaoPOO.product2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ld = LocalDate.parse("16/10/2023", dateTimeFormatter);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numProducts = sc.nextInt();

        for (int i = 0; i < numProducts; i++) {
            System.out.print("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String cui = sc.next();
            System.out.print("Name: ");
            String prodName = sc.next();
            System.out.print("Price: ");
            Double prodPrice = sc.nextDouble();

            if (cui.equals("imp")) {
                System.out.print("Customs fee: ");
                Double custFee = sc.nextDouble();
                list.add(new ImportedProduct(prodName, prodPrice, custFee));

            } else if (cui.equals("used")) {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                // RESOLVER

            } else if (cui.equals("c")) {
                list.add(new Product(prodName, prodPrice));
            }

        }

        // RESOLVER
        for (Product x : list){
            System.out.println(x);
            System.out.println(x.priceTag());
        }

    }
}

