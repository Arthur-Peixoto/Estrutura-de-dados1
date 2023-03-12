package lista2respostas.AtividadesdePilha;

public class myStackArray<T> implements myInterfaceStack<T> {
	int size;
	int top;
	private Object[] array;
	
	public myStackArray(int size) {
		this.top = -1;
		this.size = size;
		this.array = new Object[size];
	}
	
	public void push(T valor){
		System.out.println("\nEmpilhar..\n");
		
		if(top == size-1) {
			throw new Exception();
		}
		else {
		top = top + 1;
		array[top] = valor;
		}
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		System.out.println("\nDesemplilhando...\n");
		
		T retorno;
		if(top == -1) {
			throw new Exception();
		}
		else {
			retorno = (T)array[top];
			top = top -1;
		}
		return retorno;
	}

	@SuppressWarnings("unchecked")
	public T peek() {
		System.out.println("\nConsultar o topo...\n");
		
		T retorno;
		if(top == -1) {
			throw new Exception();
		}
		else {
			retorno = (T)array[top];
		}
		return retorno;
	}

	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isFull() {
		if(top == size-1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void show() {
		int i;
		
		System.out.println("\nExibindo...\n");
		
		for(i = 0; i<= top; i++) {
			System.out.println("posicao" + i + " = " + array[i] + "\n");
		}
		System.out.println("topo index = " + top + "\n");
	}
}
