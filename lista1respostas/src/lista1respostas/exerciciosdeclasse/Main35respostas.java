package lista1respostas.exerciciosdeclasse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main35respostas {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main34respostas testep = new Main34respostas();
	    List<String> palavras = new ArrayList<String>();
	    File dir = new File("D:\\Eclipseworkspace//EstruturadeDados1//Main35respostas");
	    boolean stsDir = dir.mkdir();
	    File file = new File(dir, "slas.csv");
	    boolean stsFile = file.createNewFile();
	    
	    int geral = 1;
	    while(geral !=  0){
	        System.out.println("1 - Salvar em arquivo");
	        System.out.println("2 - Ler arquivo");
	        System.out.println("0 - Sair");
	        Scanner in = new Scanner(System.in);
	        geral = in.nextInt();
	        switch(geral){
	            case 1:
	                palavras = testep.teste();
	                try {
	                    FileWriter writer = new FileWriter(file, false);
	                    PrintWriter out = new PrintWriter(writer);
	            
	                    for(palavra palavra : palavras){
	                        out.println(palavra.palavra + "," + palavra.qtd);
	                    }
	                        out.flush();
	                        out.close();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	                break;
	            case 2:
	            if (stsFile) {
	                System.out.println("Arquivo Não existe!");
	            } else {
	                System.out.println("Arquivo já existe");
	                testep.ler();
	            }
	                break;
	            case 0:
	                System.out.println("Saindo...");
	                break;
	            default:
	                System.out.println("Opção inválida");
	                break;
	        }
	    }
	   }
}

