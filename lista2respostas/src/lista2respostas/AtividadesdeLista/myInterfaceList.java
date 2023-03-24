package lista2respostas.AtividadesdeLista;

public interface myInterfaceList<T> {
	void addFirst(T value);
	
	void addLast(T value);
	
	void addAfter(T dado, T value);
	
	T peekFirst();
	
	T peekLast();
	
	T search(T value);
	
	T removeFirst();
	
	T removeLast();
	
	T remove(T value);
	
	void show();
	
	void showReverse();
}
