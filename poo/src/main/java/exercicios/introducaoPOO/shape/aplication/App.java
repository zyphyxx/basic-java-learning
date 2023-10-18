package exercicios.introducaoPOO.shape.aplication;

import exercicios.introducaoPOO.shape.entities.Circle;
import exercicios.introducaoPOO.shape.entities.Rectangle;
import exercicios.introducaoPOO.shape.entities.Shape;
import exercicios.introducaoPOO.shape.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int shapes = sc.nextInt();

        for (int i = 0; i < shapes; i++) {
            System.out.print("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r / c)? ");
            String shape = sc.next();
            System.out.print("Color (BLACK / BLUE / RED): ");
            Color color = Color.valueOf(sc.next());

            if (shape.equals("r")) {
                System.out.print("Widht: ");
                Double widht = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();

                list.add(new Rectangle(color, widht, height));
            } else if (shape.equals("c")) {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            } else {
                System.out.println("Invalid");
            }

        }

        System.out.println("SHAPE AREAS:");
        for (Shape shap : list) {
            System.out.printf("%.2f", shap.area());
        }
        sc.close();
    }
}
