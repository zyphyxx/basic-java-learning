package exercicios.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

public class Exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        // var
        String nomeFuncionario;
        double horasTrabalhadas;
        double valorHora;
        double salario;

        System.out.println("Nome funcionario: ");
        nomeFuncionario = scanner.next();

        System.out.println("Digite o numero de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();

        System.out.println("Digite o valor da hora trabalhada: ");
        valorHora = scanner.nextDouble();

        // var
        salario = horasTrabalhadas * valorHora;

        System.out.println("Nome: " + nomeFuncionario);
        System.out.printf("Salario: %.2f U$", salario );

        scanner.close();

    }
}
