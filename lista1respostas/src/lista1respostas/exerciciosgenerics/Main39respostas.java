package lista1respostas.exerciciosgenerics;

import java.util.Scanner;

public class Main39respostas {
private static Scanner scanner = new Scanner(System.in);
	
	private static <E> void exibirObjeto(E objeto) {
			System.out.println(objeto);
	}
		
		private static <E> void exibirArray(E[] array){
		for(E arr : array) {
			System.out.println(arr);
		}
	}
	
	
	public static void main(String[] args) 
	{
		Pessoa pessoas = new Pessoa("5412621671", 12, "arthur", "faço", 12.4f ,12.4f ,12.4f);
		exibirObjeto(pessoas);
		Integer[] vetInt = {1,2,3,5,4,8,6,9};
		exibirArray(vetInt);
	}
}
