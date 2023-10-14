package exercicios.estruturaVetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serao digitadas?");
        int qntPessoas = sc.nextInt();

        String nome [] = new String[qntPessoas];
        int idade [] = new int[qntPessoas];
        double altura [] = new double[qntPessoas];

        double mediaAltura = 0;
        int mediaIdade = 0;

        for (int i = 0; i < qntPessoas; i ++) {
        System.out.println("Dados da "+ i + " pessoa: " );

            System.out.print("Nome: ");
            String nome1 = sc.next();

            System.out.print("Idade: ");
            int idade1 = sc.nextInt();

            System.out.print("Altura: ");
            double altura1 = sc.nextDouble();

            nome[i] += "nome1";
            idade[i] += idade1;
            altura [i] += altura1;

            mediaAltura += altura[i]/ qntPessoas;

        }

        System.out.printf("Media: %.2f", mediaAltura);
        System.out.println();

        sc.close();

    }
}
