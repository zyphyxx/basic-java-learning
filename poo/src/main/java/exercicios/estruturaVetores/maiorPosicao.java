package exercicios.estruturaVetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int digitados = sc.nextInt();

        List<Float> lista = new ArrayList<>();

        float x = 0;
        for (int i = 0; i < digitados; i++) {
            System.out.print("Digite um numero: ");
            float numeros = sc.nextFloat();

            if (numeros > x) {
                x = numeros;
            }

            lista.add(numeros);
        }

        System.out.println("MAIOR VALOR = " + x);
        System.out.print("POSICAO DO MAIOR VALOR = " + lista.indexOf(x));
        sc.close();
    }
}
