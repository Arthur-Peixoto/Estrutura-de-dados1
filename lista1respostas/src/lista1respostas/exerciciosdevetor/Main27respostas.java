package lista1respostas.exerciciosdevetor;

public class Main27respostas {
		
		private static int[] inverter(int[] vetor){
			int tam = vetor.length;
			int invertido[] = new int[tam];
			for(int i = tam;i > 0; i--) {
				for(int w = 0; w < tam; i++) {
					invertido[i] = vetor[i];
				}
			}
			
			return invertido;
		}
		
		public static void main(String[] args) {
			int vetor[] = {10,20,30,40,50};
			inverter(vetor);
		}
}
