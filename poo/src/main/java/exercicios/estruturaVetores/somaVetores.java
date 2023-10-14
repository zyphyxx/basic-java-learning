package exercicios.estruturaVetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class somaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int capacidade = sc.nextInt();

        List<Integer> a = new ArrayList<>(capacidade);
        List<Integer> b = new ArrayList<>(capacidade);
        List<Integer> c = new ArrayList<>(capacidade);

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < capacidade; i++) {
            int valorA = sc.nextInt();
            a.add(valorA);
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < capacidade; i ++){
            int valorB = sc.nextInt();
            b.add(valorB);
        }
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < capacidade; i ++){
            c.add((a.get(i)) + b.get(i));
        }
        System.out.println(c);

        sc.close();

    }

}
