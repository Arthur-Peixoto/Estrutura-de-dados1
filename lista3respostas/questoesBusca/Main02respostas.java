package lista3respostas.questoesBusca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main02respostas {
	public static void main(String[] args) {
		List<Integer> listaValores = new ArrayList<>(15);
		
		for(int i = 0; i < 15; i++) {
			listaValores.add((int)(Math.random() * 100));
			System.out.println(listaValores.get(i).toString() + " ");
		}
		
		System.out.println("\nQual valor deseja procurar na lista? ");
		Scanner scanner = new Scanner(System.in);
		Integer buscado = scanner.nextInt();
		
		int posicao = -1;
		boolean existe = false;
		
		for(int i = 0; i < listaValores.size();i++) {
			if(listaValores.get(i) == buscado) {
				existe = true;
				posicao = i;
				break;
			}
		}
		
		if(existe) {
			System.out.println("Achou!!");
			System.out.println("Encontrado na posição: "  + posicao);
		}
		else {
			System.out.println("Não achou!");
		}
	}
}
