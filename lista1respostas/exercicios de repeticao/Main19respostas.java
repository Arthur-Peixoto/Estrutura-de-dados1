package lista1respostas;

import java.util.Locale;
import java.util.Scanner;

public class Main19respostas {
    private static Scanner scanner = new Scanner(System.in); 
    public static void Main(String Args[]){
        scanner.useLocale(Locale.US);
        int n = scanner.nextInt();
        for(int x = 0; x < 9; x++){
            System.out.println("Tabuada de "+ n + ":"+  (n*x));
        }
    }   
}
