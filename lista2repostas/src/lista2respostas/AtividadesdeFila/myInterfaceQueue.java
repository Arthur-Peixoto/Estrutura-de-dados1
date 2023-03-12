package AtividadesdeFila;

public interface myInterfaceQueue <T> {
	void add(T number);
	T remove();
	
	T peek();
	
	boolean isEmpty();
	boolean isFull();
	
	void show();
}
