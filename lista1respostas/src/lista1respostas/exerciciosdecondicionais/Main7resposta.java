package lista1respostas.exerciciosdecondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Main7resposta {
    private static Scanner scanner = new Scanner( System.in ); 
  
    public static void main(String Args[]){
        scanner.useLocale(Locale.US);
        System.out.println("Digite o numerador: ");
        double x = scanner.nextDouble();
        System.out.println("Digite o denominador: ");
        double y = scanner.nextDouble();

        if (y == 0){
            System.out.println("denominador não pode ser igual a zero ");
        }
        else{
            double z = (x/y);
            System.out.println("Resultado da divisão: " +z);
        }
    }
}
