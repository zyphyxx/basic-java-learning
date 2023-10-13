package exercicios.estruturaSequencial;/*
Fazer um programa para ler quatro valores inteiros A, B, C e D.
 A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
 */

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // var
        int a,b,c,d;
        int diferenca;

        System.out.println("Digite o PRIMEIRO numero: ");
            a = scanner.nextInt();

        System.out.println("Digite o SEGUNDO numero: ");
            b = scanner.nextInt();

        System.out.println("Digite o TERCEIRO numero: ");
            c = scanner.nextInt();

        System.out.println("Digite o QUARTO numero: ");
            d = scanner.nextInt();

        // var
        diferenca = ((a * b) - (c * d));

        System.out.println("A diferença dos produtos é: " + diferenca);

        scanner.close();

    }

}
