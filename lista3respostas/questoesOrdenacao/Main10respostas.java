package lista3respostas.questoesOrdenacao;

public class Main10respostas {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int)Math.floor(Math.random() * vetor.length);
			
		}
		
		System.out.println("Desordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
		
		quickSort(vetor, 0, vetor.length - 1);
		
		System.out.println("Ordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	
	static void quickSort(int[] vetor, int esquerda, int direita) {
		if(esquerda < direita) {
			int part = particao(vetor, esquerda, direita);
			quickSort(vetor, esquerda, part);
			quickSort(vetor, part + 1, direita);
		}
	}
	
	static int particao(int[] vetor, int esquerda, int direita) {
		int meio = (int) (esquerda + direita)/2;
		
		int x  = vetor[meio];
		int left = esquerda - 1;
		int right = direita + 1;
		while(true) {
			do {
				left++;
			}while(vetor[left] < x);
			do {
				right--;
			}while(vetor[right > x]);
			
		if(left >= right) {
			return left;
		}
		int auxiliar = vetor[left];
		vetor[left] = vetor[right];
		vetor[right] = auxiliar;
		}
	}
}

