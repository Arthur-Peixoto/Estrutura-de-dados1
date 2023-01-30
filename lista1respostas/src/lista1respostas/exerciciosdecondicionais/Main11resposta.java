package lista1respostas.exerciciosdecondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Main11resposta {
    private static Scanner scanner = new Scanner(System.in);
    public static void Main(String Args[]){
        scanner.useLocale(Locale.US);
        int conta1 = 100, conta2 = 100;
        System.out.println("Quanto gostaria de transferir? ");
        int transferir = scanner.nextInt();
        conta1 -= transferir;
        conta2 += transferir;
        System.out.println("Saldo da conta 1: "+ conta1);
        System.out.println("Saldo da conta 2: "+ conta2);
    }
}
