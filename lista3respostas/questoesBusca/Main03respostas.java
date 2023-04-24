package lista3respostas.questoesBusca;

import java.util.Scanner;

public class Main03respostas {
	public static void main(String[] args) {
		int[] vetor = new int[101];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = i * 2;
			System.out.println(vetor[i]);
		}
		
		System.out.println("Qual número deseja buscar?");
		Scanner scanner = new Scanner(System.in);
		int buscado = scanner.nextInt();
		
		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;
		boolean achou = false;
		int posicao = -1;
		int contador = 0;
		
		while(inicio <= fim) {
			meio = (int)((inicio + fim) /2);
			contador++;
			
			if(vetor[meio] == buscado){
				achou = true;
				posicao = meio;
				break;
			}else if(vetor[meio] < buscado){
				inicio = meio + 1;
			}else {
				fim = meio - 1;
			}
		}
		
		System.out.println("Quantidade de testes:" + contador);
		if(achou == true) {
			System.out.println("Achou na posição " + posicao);
		}
		else {
			System.out.println("Não achou!");
		}
	}
}
