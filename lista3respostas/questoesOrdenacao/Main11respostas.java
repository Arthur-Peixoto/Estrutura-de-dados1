package lista3respostas.questoesOrdenacao;

public class Main11respostas {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int)Math.floor(Math.random() * vetor.length);
			
		}
		
		System.out.println("Desordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
		
		for (int i = (vetor.length/2) - 1; i>= 0;i--) {
			heapSort(vetor, vetor.length, i);
		}
		
		System.out.println("Quase ordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
		for(int j = vetor.length-1; j>0; j--) {
			int auxiliar = vetor[0];
			vetor[0] = vetor[j];
			vetor[j] = auxiliar;
			
			heapSort(vetor, j, 0);
		}
		
		
		System.out.println("Ordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	
	private static void heapSort(int[] vetor, int x, int y) {
		int raiz = y;
		int left = 2*y + 1;
		int right = 2*y + 2;
		if(left < x && vetor[left] > vetor[raiz]) {
			raiz = left;	
		}
		if(left < x && vetor[right] > vetor[raiz]) {
			raiz = right;	
		}
		if(raiz != y) {
		int auxiliar = vetor[y];
		vetor[y] = vetor[raiz];
		vetor[raiz] = auxiliar;
		
		heapSort(vetor, x , raiz);
		}
		}
	}