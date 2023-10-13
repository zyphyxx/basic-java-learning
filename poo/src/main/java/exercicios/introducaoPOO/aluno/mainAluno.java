package exercicios.introducaoPOO.aluno;

import java.util.Locale;
import java.util.Scanner;

public class mainAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nome;
        double notaA, notaB, notaC;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();

        System.out.println("Digite a Primeira nota: ");
        notaA = scanner.nextDouble();

        System.out.println("Digite a Segunda nota: ");
        notaB = scanner.nextDouble();

        System.out.println("Digite a Terceira nota: ");
        notaC = scanner.nextDouble();

        Aluno.notaFinal();

    }
}
