package lista1respostas.exerciciosdeclasse;

import java.util.Scanner;

public class Main35respostas {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite uma frase");
		String frase = scanner.nextLine();
		
		String[] palavras = frase.split(" ");
		int tam = palavras.length;
		
		String dicionario[] = new String[tam];
		int[] cont = new int[tam];
		for (int j = 0; j < tam;j++) {
			for(int i = 0; i < tam;i++) {
				if(palavras[i].equals(palavras[j]) && i != j){
					palavras[i] = " ";
					cont[j]++;
				}
				else {
					dicionario[j] = palavras[j];
				}	
			}
		}	
		
		
		String[] palavrasNovas = new String[tam];
		
		for(int num = 0; num < tam; num++) {
			if(dicionario[num].equals(" ")) {
			}
			else {
				palavrasNovas[num] = dicionario[num];
				System.out.println(palavrasNovas[num] + " " + (cont[num]+1));
		}
		}
			
	}
}

