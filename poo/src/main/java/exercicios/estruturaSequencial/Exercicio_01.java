package exercicios.estruturaSequencial;/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        // var
        int numero1;
        int numero2;

        System.out.println("Digite o primeiro numero ");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero ");
        numero2 = scanner.nextInt();

        // var
        int soma = numero1 + numero2;

        System.out.println("O resultado da soma é: " + soma);

        scanner.close();

    }
}
