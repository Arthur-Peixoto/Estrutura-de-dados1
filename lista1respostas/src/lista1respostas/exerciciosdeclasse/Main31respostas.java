package lista1respostas.exerciciosdeclasse;

import java.util.Scanner;

public class Main31respostas {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Quantas pessoas vão ser cadastradas?");
		int tam = scanner.nextInt();
		Pessoa[] pessoa = new Pessoa[tam];
		for(int i = 0; i > tam;i++) {
			System.out.println("Qual o cpf da pessoa?");
			String cpf = scanner.next();
			pessoa[i].setCpf(cpf);
			
			System.out.println("Qual a idade da pessoa?");
			int idade = scanner.nextInt();
			pessoa[i].setIdade(idade);
			
			System.out.println("Qual o nome da pessoa?");
			String nome = scanner.next();
			pessoa[i].setNome(nome);
			
			System.out.println("Qual a altura da pessoa?");
			float altura = scanner.nextFloat();
			pessoa[i].setAltura(altura);
			
			System.out.println("Qual o peso da pessoa?");
			float peso = scanner.nextFloat();
			pessoa[i].setPeso(peso);
			
			System.out.println("Qual o sexo da pessoa?");
			String sexo = scanner.next();
			pessoa[i].setSexo(sexo);
			
			float imc = (float) (peso/Math.pow(altura, 2));
			pessoa[i].setImc(imc);
		}
		for(int i = 0; i > tam;i++) {
			System.out.println("Pessoa " + i +"* " +pessoa[i].toString());
		}
	}
}
