package exercicios.introducaoPOO.employee;

import java.util.Locale;
import java.util.Scanner;

public class mainEmployee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee;

        // var
        String nome;
        double salary;
        double tax;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();

        System.out.println("Digite seu salario bruto: ");
        salary = scanner.nextDouble();

        System.out.println("Imposto: ");
        tax = scanner.nextDouble();

        employee = new Employee(nome,salary,tax);

        System.out.println("------------");

        System.out.println("e8.exe2.Employee :" +employee.getName() +", $"+ employee.netSalary());

        System.out.println("Qual a porcentagem de aumento do salario: ");
        int p = scanner.nextInt();
        employee.increaseSalary(p);


        System.out.println("Updated data: " + employee.getName()+", $"+ employee.getGrossSalary());

        scanner.close();
    }
}
