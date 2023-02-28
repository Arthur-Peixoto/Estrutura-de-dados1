package lista1respostas.exercicio40e41;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main41Arespostas {
	private static void main(String[] args) {
		/*List – define uma coleção ordenada, podendo conter elementos duplicados. Em geral, o usuário tem controle 
		 * total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices. Prefira 
		 * esta interface quando precisar de acesso aleatório, através do índice do elemento;*/
		
		/*ArrayList – é como um array cujo tamanho pode crescer. A busca de um elemento é rápida, mas inserções e 
		 * exclusões não são. Podemos afirmar que as inserções e exclusões são lineares, o tempo cresce com o aumento
		 * do tamanho da estrutura. Esta implementação é preferível quando se deseja acesso mais rápido aos elementos.
		 * Por exemplo, se você quiser criar um catálogo com os livros de sua biblioteca pessoal e cada obra inserida
		 * receber um número sequencial (que será usado para acesso) a partir de zero;*/
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    cars.set(0, "Opel");
	    
	    cars.remove(0);
	    
	    /*cars.clear();*/
		
	    cars.size();
	    
		/*LinkedList – implementa uma lista ligada, ou seja, cada nó contém o dado e uma referência para o próximo nó.
		 Ao contrário do ArrayList, a busca é linear e inserções e exclusões são rápidas. Portanto, prefira LinkedList
		 quando a aplicação exigir grande quantidade de inserções e exclusões. Um pequeno sistema para gerenciar suas
		 compras mensais de supermercado pode ser uma boa aplicação, dada a necessidade de constantes inclusões e
		 exclusões de produtos; */
	    
	    LinkedList<String> carrs = new LinkedList<String>();
	    carrs.add("Volvo");
	    carrs.add("BMW");
	    carrs.add("Ford");
	    carrs.add("Mazda");
	    System.out.println(carrs);
	    
	    
	    carrs.addFirst("vasco");	//Adds an item to the beginning of the list.	
	    
	    carrs.addLast("vasco");	//Add an item to the end of the list	
	    
	    carrs.removeFirst();	//Remove an item from the beginning of the list.
	    
	    carrs.removeLast();	//Remove an item from the end of the list	
	    
	    carrs.getFirst();	//Get the item at the beginning of the list	
	    
	    carrs.getLast();	//Get the item at the end of the list
	    
	}
}
