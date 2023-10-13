package exercicios.estruturaSequencial;/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        // var
        double raio;
        double area;

        System.out.println("Entre com o valor do raio do circulo: ");
        raio = scanner.nextFloat();

        // var
        area = Math.PI * Math.pow(raio,2);

        System.out.printf("A área do círculo é: %.4f", area);

        scanner.close();

    }
}
