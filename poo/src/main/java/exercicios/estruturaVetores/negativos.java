package exercicios.estruturaVetores;

import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int quant = scanner.nextInt();

        int v [] = new int[quant];

        for (int i = 0; i < quant; i ++) {

        System.out.print("Digite um numero:");
        int num = scanner.nextInt();
        v[i] += num;
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int valor : v){
            if (valor < 0) {
            System.out.println(valor);
            }
        }



        scanner.close();
    }
}
