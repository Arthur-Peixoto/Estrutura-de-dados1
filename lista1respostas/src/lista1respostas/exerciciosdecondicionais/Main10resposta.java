package lista1respostas.exerciciosdecondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Main10resposta {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String Args[]){
        scanner.useLocale(Locale.US);
        double parImpar = scanner.nextDouble();
        if(parImpar%2 == 0){
            System.out.println(parImpar+ " É par");
        }
        else{
            System.out.println(parImpar+ " É ímpar");
        }
    }
}
