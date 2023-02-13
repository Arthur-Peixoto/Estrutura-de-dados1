package lista1respostas.exerciciosderecursividade;

import java.util.Scanner;

public class Main37respostas {
	
	private static int recursividade(int ini, int fim) {
		int soma = ini;
		if(ini >= fim) {
		}
		else {
			soma += recursividade(ini+1, fim);
		}
		return soma;
	}
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o intervalo inicial:");
		int inicio = scanner.nextInt();
		System.out.println("Digite o intervalo final:");
		int fim = scanner.nextInt();
		
		int soma = 0;
		
		for(int a = inicio; a <= fim; a++) {
			soma += a;
		}
		
		System.out.println(soma);
		
		System.out.println(recursividade(inicio, fim));
	}
}
