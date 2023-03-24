package lista2respostas.AtividadesdePilha;

import lista2respostas.AtividadesdePilha.myInterfaceStack;
import lista2respostas.AtividadesdePilha.myStackArray;

public class Main01respostas {

		public static void main(String[] args) throws Exception { 
			int retorno;
			
			myInterfaceStack<Integer> pilha1 = new myStackArray<Integer>(3);
			
			pilha1.push(3);
			pilha1.push(5);
			pilha1.push(7);
			
			retorno = pilha1.peek();
			System.out.println("elemento no topo = " + retorno);
			
			pilha1.show();
			
			pilha1.isEmpty();
			pilha1.isFull();
			
			retorno = pilha1.pop();
			System.out.println("desempilhado = " + retorno);
			
			retorno = pilha1.pop();
			System.out.println("desempilhado = " + retorno);

			retorno = pilha1.pop();
			System.out.println("desempilhado = " + retorno);
			
			pilha1.show();
			
			pilha1.isEmpty();
			pilha1.isFull();	
			}
	}
