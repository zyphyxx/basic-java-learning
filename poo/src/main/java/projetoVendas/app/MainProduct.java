package projetoVendas.app;

import projetoVendas.app.dao.OrderDAO;
import projetoVendas.app.dao.OrderItemDAO;
import projetoVendas.app.entities.Client;
import projetoVendas.app.entities.Order;
import projetoVendas.app.entities.OrderItem;
import projetoVendas.app.entities.Product;
import projetoVendas.app.enums.OrderStatus;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Birthday date (DD/MM/YYYY): ");
        String birthday = scanner.next();
        System.out.println();

        System.out.println(" < Enter order data: > ");
        System.out.print("Status: ");
        String status = scanner.next();

        Client client = new Client(name,email, birthday);

        System.out.print("How many items this order ? ");
        int num = scanner.nextInt();

        Order order = new Order();
        for (int i = 0; i < num; i ++) {
            System.out.print("Product name: ");
            String prodName = scanner.next();
            System.out.print("Product price: ");
            double prodPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int prodQuantity = scanner.nextInt();

            Product product = new Product(prodName,prodPrice);
            OrderItem orderItem = new OrderItem(prodQuantity,prodPrice,product);

            order.addItem(orderItem);

        }

















        scanner.close();
    }
}
