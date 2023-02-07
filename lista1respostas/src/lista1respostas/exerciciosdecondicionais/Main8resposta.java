package lista1respostas.exerciciosdecondicionais;

import java.util.Scanner;
import java.util.Locale;

public class Main8resposta {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String Args[]){
        scanner.useLocale(Locale.US);
        System.out.println("Informe sua altura: (em cm)");
        double altura = scanner.nextDouble();
        System.out.println("Informe seu peso: (em kg)");
        double peso = scanner.nextDouble();
        if(altura == 0){
            System.out.println("Altura não pode ser 0");
        }
        else{
            double IMC = peso/(altura*altura);
            System.out.println("seu IMC:" +IMC+ "kg/m^2");
        }
    }
}
