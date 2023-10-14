package exercicios.estruturaVetores;

import java.util.*;

public class maisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar?");
        int cap = sc.nextInt();

        List<String> nomes = new ArrayList<>(cap);
        List<Integer> idades = new ArrayList<>(cap);

        Integer pessoaMaisVelha = 0;
        for (int i = 0; i < cap; i ++){
        System.out.println("Dados " + (i+1)+ " pessoa");

            System.out.print("Nome:");
            String nome = sc.next();

            System.out.print("Idade:");
            int idade = sc.nextInt();

            nomes.add(nome);
            idades.add(idade);

            if (idades.get(i) >= idades.get(i)){
                pessoaMaisVelha = idades.get(i);
            }

        }

        System.out.println("PESSOA MAIS VELHA:" + nomes.get(idades.indexOf(pessoaMaisVelha)));


        sc.close();
    }
}
