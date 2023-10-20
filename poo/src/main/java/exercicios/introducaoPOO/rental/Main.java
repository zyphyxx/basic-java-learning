package exercicios.introducaoPOO.rental;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Model> list = new ArrayList<>();

        System.out.println("Enter rental data: ");

        System.out.print("Car model: ");
        String carModel = sc.next();


        try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

            System.out.println("Pickup (dd/MM/yyyy HH:mm): ");
            String p = sc.nextLine();

            System.out.println("Return (dd/MM/yyyy HH:mm): ");
            String r = sc.nextLine();

            LocalDateTime start = LocalDateTime.parse(p, fmt);
            LocalDateTime finish = LocalDateTime.parse(r, fmt);

            list.add(new Rental(carModel, start, finish));

        } catch (Exception e) {
            System.out.println("Formato de data e hora inválido. Certifique-se de usar o formato dd/MM/yyyy HH:mm.");

        }

        System.out.println("Enter price per hour: ");
        double priceHour = sc.nextDouble();

        System.out.println("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        list.add(new Valor(carModel, priceHour, pricePerDay));

        for (Model x : list) {
            System.out.println(x);
        }

    }
}

