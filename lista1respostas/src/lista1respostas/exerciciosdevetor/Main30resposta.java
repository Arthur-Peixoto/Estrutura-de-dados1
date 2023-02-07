package lista1respostas.exerciciosdevetor;

import java.util.Scanner;
import java.util.*;

public class Main30resposta {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		String frase = scanner.next();
		String fraseRevertida = new String();
		fraseRevertida.append(frase);
		fraseRevertida.reverse();
		System.out.println(fraseRevertida);
	}
}
