package exercicios.colecoes.generics.exemplo.aplication;

import exercicios.colecoes.generics.exemplo.service.PrintService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService printService = new PrintService();

        System.out.print("How many values? ");
        int values = sc.nextInt();

        for (int i = 0; i < values; i ++){
            int numbers = sc.nextInt();

            printService.addValue(numbers);
        }

        printService.print();
    }
}
