package lista3respostas.questoesOrdenacao;

public class Main06respostas {
	public static void main(String [] args) {
		int[] vetor = new int[50];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int)(Math.random() * 10);
			System.out.println(vetor[i] + " ");
		}
		
		int auxiliar;
		
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < vetor.length; j++) {
				if(vetor[i]< vetor[j]) {
					auxiliar = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = auxiliar;
				}
			}
		}
		
		for(int i =0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
	}
}
