package exercicios.estruturaCondicional;/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //var
        int a;
        int b;

        System.out.println("Digite o primeiro numero ");
        a = scanner.nextInt();

        System.out.println("Digite o segundo numero ");
        b = scanner.nextInt();


        if (a % b == 0 || b % a == 0){
            System.out.println("Multiplos entre si");

        } else
            System.out.println("Os numeros não são multiplos entre si");

        scanner.close();
    }
}
