package lista3respostas.questoesOrdenacao;

public class Main08respostas {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length;i++) {
			vetor[i] = (int)(Math.random() * vetor.length);
		}
		
		System.out.println("Desordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		int auxiliar, ultimo;
		for(int i = 0; i < vetor.length; i++) {
			ultimo = i;
			for(int j = i+i; j < vetor.length;j++) {
				if(vetor[j] < vetor[ultimo]) ultimo = j;
			}
			auxiliar = vetor[ultimo];
			vetor[ultimo] = vetor [i];
			vetor[i] = auxiliar;		
		}
		
		
		System.out.println("Ordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
