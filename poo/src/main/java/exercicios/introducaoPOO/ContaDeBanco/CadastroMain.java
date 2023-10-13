package exercicios.introducaoPOO.ContaDeBanco;

import java.util.Locale;
import java.util.Scanner;

public class CadastroMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();

        // entre com o numero da conta
        System.out.println("Entre com o numero da conta: ");
        cadastro.numConta = scanner.nextInt();

        //entre com o nome do usuario
        System.out.println("Entre com o nome do usuario: ");
        cadastro.nome = scanner.next();

        // deposito inicial (opicional)
        System.out.println("Quer fazer um deposito inicial ( y / n ) ? ");
        cadastro.depositoInicial = scanner.next();

        // valor do deposito
        if (cadastro.depositoInicial.equals("y")) {
            System.out.println("Entre com o valor do deposito: ");
            cadastro.saldo = scanner.nextDouble();
        } else
            scanner.close();

        // mostrar informaçoes da conta
        cadastro.infoConta();

        // efetuar um deposito
        cadastro.depositar(400); // valor teste

        // efetuar uma retirada
        cadastro.retirar(600); // valor teste
    }
}
