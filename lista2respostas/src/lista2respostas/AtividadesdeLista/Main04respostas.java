package lista2respostas.AtividadesdeLista;

public class Main04respostas {
	public static void main(String[] args) {

		myInterfaceList<Integer> listinha = new myDoubleList<Integer>();
		
		listinha.addFirst(25);
		listinha.addFirst(65);
		listinha.addLast(76);
		
		listinha.addAfter(66, 65);
		
		listinha.show();
		
		System.out.println("pegando o primeiro:" + listinha.peekFirst());
		
		System.out.println("pegando o último:" + listinha.peekLast());

		System.out.println("Removendo específico: ");
		listinha.remove(65);
		listinha.show();
		
		System.out.println("Removendo primeiro: ");
		listinha.removeFirst();
		listinha.show();
		
		System.out.println("Removendo último: ");
		listinha.removeLast();
		listinha.show();
		
		System.out.println("pegando o primeiro: " + listinha.peekFirst());
		System.out.println("pegando o último: " + listinha.peekLast());
		
		listinha.showReverse();
		
		System.out.println("procurando" + listinha.search(76));	
	}
}
