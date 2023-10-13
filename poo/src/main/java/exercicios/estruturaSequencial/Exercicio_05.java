package exercicios.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

public class Exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        // var
        int codigo_A, codigo_B;
        int numeroPecas_A, numeroPecas_B;
        double valorUnitario_A, valorUnitario_B;
        double valorTotal;

        // Leitura dos dados da peça A

        System.out.println("Codigo da peça A:");
        codigo_A = scanner.nextInt();

        System.out.println("Quantidade da peça A:");
        numeroPecas_A = scanner.nextInt();

        System.out.println("Valor unitario peça A:");
        valorUnitario_A = scanner.nextDouble();

        System.out.println("------------B-------------");

        // Leitura dos dados da peça B

        System.out.println("Codigo da peça B:");
        codigo_B = scanner.nextInt();

        System.out.println("Quantidade da peça B:");
        numeroPecas_B = scanner.nextInt();

        System.out.println("Valor unitario peça B:");
        valorUnitario_B = scanner.nextDouble();

        // Calculo do valor total

        // var
        valorTotal= (numeroPecas_A * valorUnitario_A) + (numeroPecas_B * valorUnitario_B);

        System.out.println("-------VALOR A PAGAR--------");

        // Valor a pagar

        System.out.printf("Valor a Pagar: %.2f", valorTotal);

        scanner.close();

    }
}
