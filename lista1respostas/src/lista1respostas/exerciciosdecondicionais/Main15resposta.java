package lista1respostas.exerciciosdecondicionais;

import java.util.Scanner;
import java.util.Locale;

public class Main15resposta {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String Args[]){
        scanner.useLocale(Locale.US);
        int num = scanner.nextInt();
        if(num > 1 && num < 5){
            System.out.println(
                "O número "+ num + " está no intervalo entre 1 e 5"
            );
        }
        else{
            System.out.println(
                "O número "+ num + " não está no intervalo entre 1 e 5"
            );
        }
    }
}
