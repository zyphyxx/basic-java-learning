package exercicios.estruturaVetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de provas: ");
        int cap = sc.nextInt();

        List<Float> notas = new ArrayList<>(cap);

        float x = 0;
        for (int i = 0; i < cap; i++) {
            System.out.println("Digite a nota: ");
            float notasAluno = sc.nextFloat();
            notas.add(notasAluno);
            // calcula a media
            x += (notas.get(i)) / cap;

        }
        System.out.println("MEDIA DO VETOR = " + x);

        for (int i = 0; i < cap; i++) {
            if (notas.get(i) < x) {
                System.out.println("ELEMENTOS ABAIXO DA MEDIA: " + notas.get(i));
            }

        }
        sc.close();
    }
}
