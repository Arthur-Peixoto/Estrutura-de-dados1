package lista2respostas.AtividadesdeFila;

public class Main02resposta {
	
	public static void main(String[] args) throws Exception {
		int retorno;
		
		myInterfaceQueue<Integer> filinha = new myQueueArray(3);
		
		filinha.add(1);
		filinha.add(3);
		filinha.add(5);
		
		retorno = filinha.peek();
		System.out.println("Início da fila" + retorno);
		
		System.out.println("cheio? " + filinha.isFull());
		
		filinha.show();
		
		retorno = filinha.remove();
		System.out.println("removido = " + retorno);
		
		retorno = filinha.remove();
		System.out.println("removido = " + retorno);
		
		retorno = filinha.remove();
		System.out.println("removido = " + retorno);
		
		filinha.show();
		
		System.out.println("vazio? " + filinha.isEmpty());
		
	}
}
