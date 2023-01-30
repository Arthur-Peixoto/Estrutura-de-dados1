package lista1respostas.exerciciosdecondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Main14resposta {
    private static Scanner scanner = new Scanner(System.in);
    public static void Main(String Args[]){
        scanner.useLocale(Locale.US);
        System.out.println("Escreva as variáveis da equação de segundo grau \n a:");
        double a = scanner.nextDouble();
        System.out.println("Escreva as variáveis da equação de segundo grau \n b:");
        double b = scanner.nextDouble();
        System.out.println("Escreva as variáveis da equação de segundo grau \n c:");
        double c = scanner.nextDouble();
        double delta = delta(a,b,c);
        System.out.println("Delta: " +delta );
        double[] raizes = new double[2];
        raizes = raizes(delta, a, b);
        System.out.println("Raiz 1:" + raizes[0]  + "\nRaiz 2:" + raizes[1]);
    }

    private static double delta(double a, double b, double c){
        double delta = (Math.pow(b, 2))+ a*c*-4;

        return delta;
    }

    private static double[] raizes(double delta, double a, double b){
        double raizes[] = new double[2];
        raizes[0] = ((b*-1)+Math.sqrt(delta)/2*a);
        raizes[1] = ((b*-1)-Math.sqrt(delta)/2*a);

        return raizes;
    }
}
 