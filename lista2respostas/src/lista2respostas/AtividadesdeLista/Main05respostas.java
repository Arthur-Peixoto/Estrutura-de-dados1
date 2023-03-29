package lista2respostas.AtividadesdeLista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main05respostas {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		String path = "frasesEscritas.txt";
		
		String pathWriteBIN = "contagem.bin";
		String pathWriteTXT = "contagem.txt";
		
		mySimpleList<String> teste = new mySimpleList<String>();
		teste = lerFrases(path);
		String textoCompleto = ("");
		
		for(int i = 0;i <= teste.size; i++) {
			textoCompleto += teste.removeFirst();
		}
		contador(textoCompleto, pathWriteBIN);
		contador(textoCompleto, pathWriteTXT);
	}
	
	public static void contador(String frase, String path) throws IOException {
		
		frase = frase.toLowerCase();
		
		String[] fraseSeparada = frase.split(" ");
		String[] fraseEscrita = new String[fraseSeparada.length];
		
		for(int i = 0; i < fraseSeparada.length; i++) {
			int cont = 0;
			
			for (int j = 0; j < fraseSeparada.length; j++) {
				if(fraseSeparada[i].equals(fraseSeparada[j])) {
					cont++;
				}
			}
			int verifique = 0;
			
			for (int z = 0; z < fraseEscrita.length; z++) {
				if(fraseSeparada[i].equals(fraseSeparada[z])) {
					verifique = 1;
				}
			}
			
			fraseEscrita[i] = fraseSeparada[i];
		
			if(verifique == 0) {
				String resultado = fraseEscrita[i] + " " + cont + " ";
				escrever(path, resultado);
			}
		}	
	}
	
	public static void escrever(String path, String frase) throws IOException {
		BufferedWriter buffer = new BufferedWriter(new FileWriter(path,true));
		buffer.append("\n");
		buffer.close();
	}
	
	public static void ler(String path) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(path));
		String linha = buffer.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
		}
		
		buffer.close();
	}
	
	@SuppressWarnings("rawtypes")
	public static mySimpleList lerFrases(String path) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(path));
		String linha = buffer.readLine();
		
		mySimpleList<String> fraseTexto = new mySimpleList<String>();
		
		while(linha != null) {
			fraseTexto.addLast(linha);
			linha = buffer.readLine();
		}
		
		buffer.close();
		return fraseTexto;
	}
}	
