package lista2respostas.AtividadesdePilha;

public interface myInterfaceStack<T> {
	void push(T number) throws Exception;
	
	T pop() throws Exception;
	
	T peek() throws Exception;
	
	boolean isEmpty();
	boolean isFull();
	
	void show();
}
