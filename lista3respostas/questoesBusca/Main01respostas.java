package lista3respostas.questoesBusca;

import java.util.Scanner;

public class Main01respostas {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		for(int i = 0;i < vetor.length; i++) {
			vetor[i] = (int)(Math.random() * 10);
			System.out.println(vetor[i] + " ");
		}
		
		System.out.println("qual valor deseja procurar no vetor ?");
		try( Scanner leitor = new Scanner(System.in)){
			int buscando = leitor.nextInt();
			int posicao = -1;
			boolean existe = false;
			for(int i = 0; i  < vetor.length; i++) {
				if(vetor[i] == buscando) {
					existe = true;
					posicao = i;
					break;
				}
			}
			
			if(existe) {
				System.out.println("Achou");
				System.out.println("Na seguinte posição do vetor: "  + posicao);
			}
			else {
				System.out.println("Nada encontrado");
			}
		}
	}
}
