package lista1respostas;

import java.util.Locale;
import java.util.Scanner;

public class Main13resposta {
    private static Scanner scanner = new Scanner(System.in);
    public static void Main(String Args[]){
        scanner.useLocale(Locale.US);
        double nota1 = 10;
        double nota2 = 5;
        double nota3 = 7;

        double media = ((nota1 + nota2 + nota3)/3);

        if(media >= 7){
            System.out.println("Você está aprovado!");
        }
        else if(media < 7 && media >= 3.5){
            System.out.println("Você está na recuperação!");
            double precisa = ((5  - media*0.6)/0.4);
            System.out.println("Você precisa de "+ precisa + " pontos");
        }
        if(media < 3.5){
            System.out.println("Você está reprovado!");
        }

    } 
}
