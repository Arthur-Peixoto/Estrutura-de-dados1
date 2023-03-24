package lista2respostas.AtividadesdeFila;

public class myQueueArray<T> implements myInterfaceQueue<T> {
		int size;
		
		int primeiro;
		int ultimo;
		
		private Object[] arrayQueue;
		
		public myQueueArray(int tamanho){
			this.primeiro = -1;
			this.ultimo = -1;
			this.size = tamanho;
			
			this.arrayQueue = new Object[size];
		}
		
		public void add(T valor) throws Exception {
			System.out.println("Inserir na fila...");
		
			int lastTemp = (ultimo + 1) % size;
			
			if(lastTemp == primeiro) {
				System.out.println("fila cheia");
			}
			
			ultimo = lastTemp;
			arrayQueue[ultimo] = valor;
			
			if(primeiro == -1) {
				primeiro = 0;
			}
			
		}

		public T remove() throws Exception {
			System.out.println("Removendo...");
			
			T retorno;
			
			if(primeiro == -1) {
				System.out.println("fila vazia");
			}
			
			retorno = (T)arrayQueue[primeiro];
			
			if(ultimo == primeiro) {
				ultimo = -1;
				arrayQueue[ultimo] = -1;
				}
			else {
				primeiro = (primeiro + 1) % size;
			}
			
			return retorno;
		}

		public T peek() throws Exception {
			System.out.println("Consultando...");
			
			T retorno;
			
			if(primeiro == -1) {
				System.out.println("fila vazia");
			}
			
			retorno = (T)arrayQueue[primeiro];
			
			return retorno;
		}

		public boolean isEmpty() {
			if(primeiro == -1) {
				return true;
			}
			else {
				return false;
			}
		}

		public boolean isFull() {
			int lastTemp = (ultimo + 1) % size;
			
			if(lastTemp == primeiro) {
				return true;
			}
			else {
				return false;
			}
		}

		
		public void show() {
			int i = primeiro;
			
			if(primeiro == -1) {
				return;
			}
			
			while(i != ultimo) {
				System.out.println("posicao" + " = " + arrayQueue[i] + "\n");
			
				i = ( i + 1) % size;
			}
			System.out.println("posicao" + " = " + arrayQueue[i] + "\n");
			
			System.out.println("inicio = " + primeiro + " fim = " + ultimo + "\n");
		}
}
