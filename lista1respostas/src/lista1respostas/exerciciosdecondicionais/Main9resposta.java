package lista1respostas.exerciciosdecondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Main9resposta {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String Args[]){
        scanner.useLocale(Locale.US);
        double pi = Math.PI;
        System.out.println("Qual o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = pi *(raio*raio);
        System.out.println("Área do círculo: "+ area);
    }
}
