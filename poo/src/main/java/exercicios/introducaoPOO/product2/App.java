package exercicios.introducaoPOO.product2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numProducts = sc.nextInt();

        for (int i = 0; i < numProducts; i++) {
            System.out.print("Product #" + i+1 + " data:");
            System.out.print("Common, used or imported (custom/used/imported)? ");
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
                String usedDate = sc.next();

                LocalDate localDate = LocalDate.parse(usedDate,dateTimeFormatter);

                list.add(new UsedProduct(prodName,prodPrice,localDate));


            } else if (cui.equals("c")) {
                list.add(new Product(prodName, prodPrice));
            }

        }

        System.out.println("PRICE TAGS: ");
        for (Product x : list){
            System.out.println(x.priceTag());

        }

    }
}

