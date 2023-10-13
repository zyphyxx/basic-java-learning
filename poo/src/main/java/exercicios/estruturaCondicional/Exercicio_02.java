package exercicios.estruturaCondicional;/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // var
        int numero;
        int restoDivisao;

        System.out.println("Digite um numero inteiro: ");
        numero = scanner.nextInt();

        // var
         restoDivisao = numero % 2;

        if ( restoDivisao == 0 ){
            System.out.println("O numero: " + numero+ " é PAR");
        }
        else
            System.out.println("O numero: "+ numero + " é IMPAR");

        scanner.close();

    }
}
