package lista1respostas.exerciciosdeentradasaídaoperadores;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Main2resposta {
    private static Scanner scanner = new Scanner( System.in );
    public static void main (String Args[]){
        scanner.useLocale(Locale.US);
        int idade;
        float altura;
        char primeiraLetra = 'A';
        String nomeCompleto;
    
        System.out.print("Informe um idade: ");
		idade = scanner.nextInt();

        System.out.print("Informe um float: ");
		altura = scanner.nextFloat();

        System.out.print("Informe um char1: ");
		try {
			primeiraLetra = (char)System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		scanner.nextLine();
    
        System.out.print("Informe seu nome completo: ");
		nomeCompleto = scanner.nextLine();
    
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
        System.out.println("Primeira letra do nome: " + primeiraLetra);
        System.out.println("Nome completo: " + nomeCompleto);
    }
}
