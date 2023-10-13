package exercicios.introducaoPOO.rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle;


        System.out.println("Digite a largura");
        double widht = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        double height = scanner.nextDouble();

        rectangle = new Rectangle(widht,height);


        System.out.println("AREA = " +rectangle.area());
        System.out.println("PERIMETER = " +rectangle.perimeter());
        System.out.println("DIAGONAL = " +rectangle.diagonal());

        scanner.close();
    }
}
