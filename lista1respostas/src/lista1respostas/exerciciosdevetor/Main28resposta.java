package lista1respostas.exerciciosdevetor;

public class Main28resposta {
	public static void main(String[] args) {
		int vetor[] = {4,2,12,53,9};
		int tam = vetor.length;
		int maior = 0;
		for(int i = 0; i < tam; i++) {
			if(maior < vetor[i]) {
			maior = vetor[i];
			}
		}
		System.out.println(maior);
	}
}
