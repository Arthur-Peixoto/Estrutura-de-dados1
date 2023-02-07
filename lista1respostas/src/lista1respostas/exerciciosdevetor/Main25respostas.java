package lista1respostas.exerciciosdevetor;

import java.util.Scanner;
import java.util.Random;

public class Main25respostas {
	private static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args){
			Random random = new Random(); //iniciando biblioteca random
			System.out.println("Qual o tamanho do vetor?");
			int tam = scanner.nextInt();
			int vet[] = new int[tam];//iniciando vetor com tamanho determinado pelo usuário 
			for(int i = 0; i < tam; i++) {
				vet[i] = random.nextInt(); //preenchendo o vetor usando biblioteca random
				System.out.println(vet[i]);
			}
		}
}
