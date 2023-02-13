package lista1respostas.exerciciosderecursividade;

import java.util.Scanner;

public class Main36respostas {
	
	public static int fatorial(int num) {
		int fatrial = num;
		while(num != 1) {
			num--;
			fatrial *= num;
			fatorial(num);
		}
		return fatrial;
	}
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o número que você gostaria de saber o fatorial:");
		int num = scanner.nextInt();
		int result = fatorial(num);
		System.out.println(result);
	}
}
