package lista3respostas.questoesOrdenacao;

public class Main09respostas {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		System.out.println("Desordenado");
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int)(Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}
		
		int x = 1;
		while(x < vetor.length) {
			x = x*3+1;
		}
		x = (int) Math.floorDiv(h, 3);
		
		int elemento, auxiliar;
		while(x > 0) {
			for(int i = x; i < vetor.length; i++) {
				elemento = vetor[i];
				auxiliar = i;
				while(auxiliar >=  x && vetor[auxiliar - x] > elemento ) {
					vetor[auxiliar] = vetor [auxiliar - x];
					auxiliar = auxiliar - x;
			}
				vetor[auxiliar] = elemento;
		}
			x = x/2;
		}
		
		
		System.out.println("Ordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
