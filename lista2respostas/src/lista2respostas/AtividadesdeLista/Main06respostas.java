package lista2respostas.AtividadesdeLista;

public class Main06respostas {
	public static void main(String[] args) {
		mySimpleList<Integer> teste = new mySimpleList<Integer>();
		
		teste.addFirst(50);
		teste.addFirst(40);
		teste.addFirst(25);
		
		teste.show();
		
		teste.removeFirst();
		teste.show();
		
		teste.removeFirst();
		teste.show();
		
		teste.removeFirst();
		teste.show();
	}
}
