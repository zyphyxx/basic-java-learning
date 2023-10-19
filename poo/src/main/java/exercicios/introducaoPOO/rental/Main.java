package exercicios.introducaoPOO.rental;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Model> list = new ArrayList<>();

        System.out.println("Enter rental data: ");

        System.out.print("Car model: ");
        String carModel = sc.next();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Pickup (dd/MM/yyyy HH:mm): ");
        LocalDateTime pickup = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.println("Return (dd/MM/yyyy HH:mm): ");
        LocalDateTime returnn = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.println("Enter price per hour: ");
        double priceHour = sc.nextDouble();

        System.out.println("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        list.add(new Rental(carModel, pickup, returnn));
        list.add(new Valor(carModel, priceHour, pricePerDay));

        for (Model x : list) {
            System.out.println(x);
        }
    }
}

