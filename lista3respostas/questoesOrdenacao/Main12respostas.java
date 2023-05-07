
public class Main12respostas {
	public static void main(String[] args) {
	System.out.println("\nTempo de execução em milissegundos");
    System.out.println("\n----------------------------------");
    int[] vetor = new int[300]; // vetor grande para ver diferença no tempo
    System.out.println("Vetor inical aleatorio: ");

    for (int i = 0; i < vetor.length; i++) {
          vetor[i] = (int) (Math.random() * 10);
          System.out.print(vetor[i] + " ");
    }

    System.out.println("\n----------------------------------");
    System.out.println("\nUsando bubble sort: ");
    bubbleSort(vetor);
    System.out.println("\n----------------------------------");

    System.out.println("\n----------------------------------");
    System.out.println("\nUsando insert sort: ");
    insertSort(vetor);
    System.out.println("\n----------------------------------");

    System.out.println("\n----------------------------------");
    System.out.println("\nUsando select sort: ");
    selectSort(vetor);
    System.out.println("\n----------------------------------");

    System.out.println("\n----------------------------------");
    System.out.println("\nUsando shell sort: ");
    shellSort(vetor);
    System.out.println("\n----------------------------------");

    System.out.println("\n----------------------------------");
    System.out.println("\nUsando quick sort: ");
    quickSort(vetor);
    System.out.println("\n----------------------------------");

    System.out.println("\n----------------------------------");
    System.out.println("\nUsando heap sort: ");
    heapSort(vetor);
    System.out.println("\n----------------------------------");
}

 private static void bubbleSort(int vetor[]) {
	 	long inicio = System.currentTimeMillis();
		long fim;
		
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
		
		fim = System.currentTimeMillis();
		System.out.println("Tempo decorrido: " + (fim - inicio));
		
		System.out.println("Ordenado com Insert Sort:");
		for(int i =0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
 }
 
 private static void insertSort(int[] vetor) {
	 long inicio = System.currentTimeMillis();
	 long fim;
	 
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
		
	 
	 fim = System.currentTimeMillis();
	 System.out.println("Tempo decorrido: " + (fim - inicio));
		
	 System.out.println("Ordenado com Insert Sort:");
	 for(int i =0; i < vetor.length; i++) {
		System.out.println(vetor[i] + " ");
	 }
 }
 
 private static void selectSort(int[] vetor) {
	 long inicio = System.currentTimeMillis();
	 long fim;
	 
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
		
	 
	 fim = System.currentTimeMillis();
	 System.out.println("Tempo decorrido: " + (fim - inicio));
		
	 System.out.println("Ordenado com Select Sort:");
	 for(int i =0; i < vetor.length; i++) {
		System.out.println(vetor[i] + " ");
	 }
 }
 
 private static void shellSort(int[] vetor) {
	 long inicio = System.currentTimeMillis();
	 long fim;
	 
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
		
	 
	 fim = System.currentTimeMillis();
	 System.out.println("Tempo decorrido: " + (fim - inicio));
		
	 System.out.println("Ordenado com Shell Sort:");
	 for(int i =0; i < vetor.length; i++) {
		System.out.println(vetor[i] + " ");
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
