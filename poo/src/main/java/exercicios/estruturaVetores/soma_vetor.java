package exercicios.estruturaVetores;

import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("VALORES = ");

        System.out.println("Quantos números você vai digitar?");
        int num = sc.nextInt();

        double v[] = new double[num];

        double soma = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Digite um número: ");
            double entrada = sc.nextDouble();
            v[i] = entrada;
            soma += v[i];
        }

        for (double valor : v) {
            sb.append(String.format("%.1f ", valor));
        }


        String resultado = sb.toString();
        System.out.println(resultado);
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + soma / num);
    }
}
