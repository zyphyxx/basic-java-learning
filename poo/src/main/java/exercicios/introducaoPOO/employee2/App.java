package exercicios.introducaoPOO.employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees:");
        int numEmployees = sc.nextInt();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee #" + i + 1 + " data:");
            System.out.print("Outsourced (y/n)?");
            String outsourced = sc.next();

            System.out.print("Name:");
            String name = sc.next();
            System.out.print("Hours:");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour:");
            Double valueHours = sc.nextDouble();

            if (outsourced.equals("y")) {
                System.out.print("Additional charge: ");
                Double additional = sc.nextDouble();

                list.add(new OutsourcedEmployee(name, hours, valueHours, additional));
            } else {

                list.add(new Employee(name, hours, valueHours));
            }
        }
        System.out.println("PAYMENTS:");
        for (Employee x : list) {
            System.out.println(x.getName() + " - $ " + x.payment());
        }
    }
}
