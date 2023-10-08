package exercicios.ConversorDeDollar;

import java.util.Locale;
import java.util.Scanner;

public class DollarMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        // client
        System.out.println("Qual o preço do dollar hoje ?");
        double dollarHoje = scanner.nextDouble();

        System.out.println("Quantidade de dollar que voce quer comprar: ");
        double qtdComprar = scanner.nextDouble();

        System.out.println("quantidade a pagar em reais: " +
                Conversor.valorPagar(dollarHoje,qtdComprar)+" R$");




    }
}
