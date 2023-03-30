package lista2respostas.AtividadesdeLista;

public class Main07respostas {
	public static void main(String[] args) {
		mySimpleList<Integer> teste = new mySimpleList<Integer>();
		
		teste.addFirst(50);
		teste.addLast(40);
		teste.addLast(25);
		
		teste.show();
		
		teste.removeFirst();
		teste.show();
		
		teste.removeFirst();
		teste.show();
		
		teste.removeFirst();
		teste.show();
	}
}
