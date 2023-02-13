package lista1respostas.exerciciosdevetor;

import java.util.Scanner;
import java.util.*;

public class Main30resposta {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		StringBuffer frase = new StringBuffer();
		frase.append(scanner.next());	
		System.out.println(frase);
		System.out.println(frase.reverse());
	}
}
