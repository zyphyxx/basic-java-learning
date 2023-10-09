package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar ? ");
        int n = scanner.nextInt();

        int [] vet = new int[n];

        for (int i = 0; i < vet.length;i ++){
            System.out.println("Digite um numero: ");
            vet[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for (int i = 0; i < vet.length; i ++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }

        scanner.close();
    }
}
