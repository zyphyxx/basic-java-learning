package exercicios.estruturaCondicional;/*
Fazer um programa para ler um número inteiro,
 e depois dizer se este número é negativo ou não.
 */

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // var
        int numero;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("O numero escolhido é: NEGATIVO");
        } else
            System.out.println("O numero escolhido é: POSITIVO");

        scanner.close();

    }
}
