package exercicios.introducaoPOO.fee.aplication;

import exercicios.introducaoPOO.fee.entities.Company;
import exercicios.introducaoPOO.fee.entities.Individual;
import exercicios.introducaoPOO.fee.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numTaxPayers = sc.nextInt();

        for (int i = 0; i < numTaxPayers; i++) {
            System.out.print("tax payer #" + (i + 1) + " data:");

            System.out.print("Individual or company (i/c)?");
            String indOrComp = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual income:  ");
            double anualInc = sc.nextDouble();

            if (indOrComp.equals("i")) {
                System.out.print("Health expenditures: ");
                double healthExpend = sc.nextDouble();

                list.add(new Individual(name, anualInc, healthExpend));

            } else if (indOrComp.equals("c")) {
                System.out.print("Number of employees: ");
                int numEmployye = sc.nextInt();

                list.add(new Company(name, anualInc, numEmployye));

            }

            for (TaxPayer taxPayer : list) {
                System.out.printf("%s: $%.2f%n", taxPayer.getName(), taxPayer.tax());
            }
        }
    }
}
