package exercicios.estruturaVetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<NomeListas> lista = new ArrayList<>();

        String nome;
        do {
            System.out.println("Digite seu nome: ");
            nome = scanner.next();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

        } while (nome == "sair");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello");
        stringBuilder.append("World");

        String result = stringBuilder.toString();

        System.out.println(result);


    }
}
