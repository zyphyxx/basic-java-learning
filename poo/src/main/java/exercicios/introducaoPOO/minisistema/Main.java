package exercicios.introducaoPOO.minisistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();

        System.out.println("Quantos alunos para cadastrar? ");
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.next();

            System.out.println("Digite o sobrenome:");
            String sobrenome = scanner.next();

            cadastro.lista.add(new Cadastro(nome,sobrenome));
        }

        cadastro.criar();

        scanner.close();

    }
}
