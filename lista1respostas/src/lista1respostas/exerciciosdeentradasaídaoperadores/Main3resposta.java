package lista1respostas.exerciciosdeentradasaídaoperadores;

import java.util.Locale;
import java.util.Scanner;

public class Main3resposta {
    private static Scanner scanner =  new Scanner(System.in);
    public static void main(String Args[]){
        scanner.useLocale(Locale.US);
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();    
        
        System.out.println("Soma = "+ int1 + int2);
        System.out.println("Subtração = "+ (int1 - int2));
        System.out.println("Divisão = "+ (int1 / int2));
        System.out.println("Multiplicação = "+ (int1 * int2));
        
    }
    
}
