package exercicios.treinando.entities;


import java.util.Random;
import java.util.Scanner;

public class Lampada {

    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    Scanner sc = new Scanner(System.in);
    public void estadado() {

        while (true) {
            System.out.println("1 - para ligado: ");
            System.out.println("2 - para desligado: ");
            System.out.println();
            x = sc.nextInt();
            if (x == 1) {
                System.out.println("Luz acessa");
                break;
            } else if (x == 2) {
                System.out.println("Luz apagada");
                break;
            } else {
                System.out.println("digite novamente");
            }
        }


    }

    public void sorteio(){
        while (true){
        System.out.println("Digite um numero: ");
        x = sc.nextInt();
        Random random = new Random();
        int numAleatorio = random.nextInt(10);

        if (x == numAleatorio){
            System.out.println("parabens voce acertou");
            break;
        }else {
            System.out.println("errou"+"o numero era:"+ numAleatorio);
        }

        }
        sc.close();

    }



}
