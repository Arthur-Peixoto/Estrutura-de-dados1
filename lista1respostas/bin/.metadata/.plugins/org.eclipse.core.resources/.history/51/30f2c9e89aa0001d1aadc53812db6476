package lista1respostas.exerciciosdeentradasaídaoperadores;

import java.util.Locale;
import java.util.Scanner;

public class Main6resposta {

    private static Scanner scanner = new Scanner( System.in ); 
  
    public static void Main(String Args[]){
        scanner.useLocale(Locale.US);
        double refri = 1.5;
        double pizza = 3.0;
        double txGarcom = 0.1;
        int qntPizza;
        int qntRefri;
        int qntPessoas;

        System.out.print("Informe a quantidade de pizzas: ");
		qntPizza = scanner.nextInt();
        System.out.print("Informe a quantidade de refrigerantes: ");
		qntRefri = scanner.nextInt();
        System.out.print("Informe a quantidade de pessoas: ");
		qntPessoas = scanner.nextInt();

        double SemTaxa = (qntRefri * refri) + (pizza * qntPizza);
        double Taxa = txGarcom*((qntRefri * refri) + (pizza * qntPizza)/qntPessoas);
        double ComTaxa = SemTaxa + Taxa;
        System.out.print("Valor sem Taxa: "+ SemTaxa);
        System.out.print("Valor da taxa: "+ Taxa);
        System.out.print("Valor com Taxa: "+ ComTaxa);
    }
}
