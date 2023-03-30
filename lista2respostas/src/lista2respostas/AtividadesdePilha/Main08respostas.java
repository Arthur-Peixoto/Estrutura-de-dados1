package lista2respostas.AtividadesdePilha;

import java.util.Scanner;

public class Main08respostas {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		int x = 1;
		do{
			System.out.println("Digite a expressão pós-fixa separando tudo com espaços: ");
			String expressao = scanner.nextLine();
			
			String verifica[] = new String[expressao.length()];
			String agrega = "";
			int j = 0;
			
			for(int i = 0; i < expressao.length(); i++) {
				if(expressao.charAt(i) != ' ') {
					agrega += (expressao.charAt(i));
					verifica[j] = agrega;
				}
				else {
					agrega = "";
					j++;
				}
			}
			
			
			int size = 0;
		
			while(verifica[size] != null){
			size++;
			}
			
			decodificar(verifica, size);
			
			System.out.println("Deseja um novo calculo se SIM digite 1 e se não digite 0: ");
			x = scanner.nextInt();
			scanner.nextLine();
		}while(x !=0);
	}
	
	public static void decodificar(String[] expressao, int size) throws Exception{
		myInterfaceStack<Double> pilha = new myStackArray<Double>(size);
		
		double numeroDesempilhado;
		double numeroDesempilhado1;
		
		for(int i = 0; i < size; i++) {
			String simbolo = expressao[i];
			switch(simbolo) {
			case "^":
				numeroDesempilhado = pilha.peek();
				numeroDesempilhado1 = pilha.peek();
			
				pilha.push((Math.pow(numeroDesempilhado1, numeroDesempilhado)));
				break;
				
			case "/":
				numeroDesempilhado = pilha.pop();
				numeroDesempilhado1 = pilha.pop();
			
				pilha.push(numeroDesempilhado1/numeroDesempilhado);
				break;
				
			case "*":
				numeroDesempilhado = pilha.pop();
				numeroDesempilhado1 = pilha.pop();
			
				pilha.push(numeroDesempilhado1*numeroDesempilhado);
				break;
				
			case "-":
				numeroDesempilhado = pilha.pop();
				numeroDesempilhado1 = pilha.pop();
			
				pilha.push(numeroDesempilhado1-numeroDesempilhado);
				break;
				
			case "+":
				numeroDesempilhado = pilha.pop();
				numeroDesempilhado1 = pilha.pop();
			
				pilha.push(numeroDesempilhado1+numeroDesempilhado);
				break;
				
			default:
				pilha.push(Double.valueOf(simbolo));
				break;
			}
			}
		System.out.println(pilha.peek());
	}
}
