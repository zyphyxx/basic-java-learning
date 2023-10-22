package exercicios.colecoes.hashAndEquals.application;

import exercicios.colecoes.hashAndEquals.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria","maria@gmail.com");
        Client c2 = new Client("Maria","alex@gmail.com");
        Client c3 = new Client("Maria","maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c3));
    }
}
