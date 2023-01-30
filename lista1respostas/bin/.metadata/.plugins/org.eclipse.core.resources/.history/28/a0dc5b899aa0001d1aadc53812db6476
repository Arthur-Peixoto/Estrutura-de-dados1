package lista1respostas.exerciciosderepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Main20resposta {
    private static Scanner scanner = new Scanner( System.in ); 
  
    public static void Main(String Args[]){
        scanner.useLocale(Locale.US);
        System.out.print("Qual seu investimento inicial?"); 
        double invInicial = scanner.nextDouble();
        double saldo = invInicial;
        System.out.print("Por quantos meses deseja realizar o investimento?"); 
        int qntMeses = scanner.nextInt();
        System.out.print("Informe a taxa de juros?");
        double Taxas = scanner.nextDouble();
        System.out.print("Quanto você gostaria de investir mensalmente?");
        double invMensal = scanner.nextDouble();
        for(int mes = 1; mes <= qntMeses; mes++)
	    {
            double rendMensal = ((saldo + invMensal)*Taxas);
            saldo += rendMensal;
            System.out.print("Saldo do mês:" + saldo);
	    }
    }

}