package lista3respostas.questoesOrdenacao;

public class Main07respostas {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length;i++) {
			vetor[i] = (int)(Math.random() * vetor.length);
		}
		
		System.out.println("Desordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		int auxiliar, j;
		
		for(int i = 1; i <vetor.length; i++) {
			auxiliar = vetor[i];
			j = i-1;
			while(j >= 0 && vetor[j] > auxiliar) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j+1] = auxiliar;
		}
		
		System.out.println("Ordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
