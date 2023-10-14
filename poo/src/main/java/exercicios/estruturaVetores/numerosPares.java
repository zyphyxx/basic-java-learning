package exercicios.estruturaVetores;

import java.util.ArrayList;
import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?");
        int qntNumeros = sc.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < qntNumeros; i++) {
            System.out.print("Digite um numero: ");
            int numerosDigitados = sc.nextInt();
            if (numerosDigitados % 2 == 0) {
                numeros.add(numerosDigitados);
            }
        }

        System.out.println("NUMEROS PARES: \n" + numeros);
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + numeros.size());


        sc.close();
    }
}
