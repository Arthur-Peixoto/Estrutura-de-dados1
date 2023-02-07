package lista1respostas.exerciciosdevetor;

import java.util.Random;
import java.util.Scanner;

public class Main26resposta {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Quantas linhas você deseja que seu vetor tenha?");
		int linhas = scanner.nextInt();
		System.out.println("Quantas colunas você deseja que seu vetor tenha?");
		int colunas = scanner.nextInt();
		int matriz[][] = new int[linhas][colunas];
		for(int i = 0; i < linhas;i++) {
			for(int w = 0; w < colunas; w++) {
				matriz[i][w] = random.nextInt();
				System.out.println(matriz[i][w]);
			}
		}
	}
}
