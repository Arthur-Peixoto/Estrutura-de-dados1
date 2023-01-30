package lista1respostas;

import java.util.Scanner;
import java.util.Locale;

public class Main16reposta {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void Main(String Args[]){
        scanner.useLocale(Locale.US);
        int inicio = scanner.nextInt();
        int fim = scanner.nextInt();
        int contador1 = inicio;
        int contador2 = inicio;
        while(contador1 > fim){
            System.out.println(contador1);
            contador1++;
        }
        do{
            System.out.println(contador1);
            contador1++;
        }
        while(contador2 > fim);
        for(int contador3 = inicio; contador3 > fim; contador3++){
            System.out.println(contador3);
        }
    }
}
