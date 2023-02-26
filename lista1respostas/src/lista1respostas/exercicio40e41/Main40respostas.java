package lista1respostas.exercicio40e41;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main40respostas {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int controler = 1;
            while(controler != 0){
                 System.out.println("Selecione uma opção: ");
                    System.out.println("1 - Criptografar");
                    System.out.println("2 - Descriptografar");
                    System.out.println("0 - Sair");
                    controler = scanner.nextInt();
                    switch (controler) {
                        case 1:
                             System.out.print("O arquivo a ser criptografado é q40.txt");
                             System.out.println("Caso o arquivo não esteja na pasta ou não exista por favor adicione ");
                             System.out.println("Esperando a verificação do arquivo...\n Pessione Enter para continuar......");
                             
                            try {
                                System.in.read();
                                FileInputStream file = new FileInputStream(new File("D:\\Projects\\Java\\listabruno\\q40\\q40.txt"));
                                InputStreamReader reader = new InputStreamReader(file);
                                BufferedReader buffer = new BufferedReader(reader);
                                String linha = "";
                                while((linha = buffer.readLine()) != null){
                                    linha = linha.toLowerCase();
                                    System.out.println(linha);
                                    char[] linhaChar = linha.toCharArray();
                                    
                                    for(int i = 0; i < linhaChar.length; i++){
                                        switch(linha.charAt(i)){
                                            case 'z':  
                                                linhaChar[i] = 'p';
                                                break;
                                            case 'p':
                                                linhaChar[i] = 'z';
                                                break;
                                            case 'e':  
                                                linhaChar[i] = 'o';
                                                break;
                                            case 'o':
                                                linhaChar[i] = 'e';
                                                break;
                                            case 'a':
                                                linhaChar[i] = 'i';
                                                break;
                                            case 'i':
                                                linhaChar[i] = 'a';
                                                break;
                                            case 'n':
                                                linhaChar[i] = 'l';
                                                break;
                                            case 'l':
                                                linhaChar[i] = 'n';
                                                break;
                                            case 't':
                                                linhaChar[i] = 'r';
                                                break;
                                            case 'r':
                                                linhaChar[i] = 't';
                                                break;
                                        }
                                    }
                                    linha = new String(linhaChar);
                                    System.out.println(linha);
                                    System.out.println("Escrevendo no arquivo...");

                                FileOutputStream file2 = new FileOutputStream(new File("D:\\Projects\\Java\\listabruno\\q40\\q40cript.txt"));
                                PrintWriter pr = new PrintWriter(file2);
                                    pr.println(linha);
                                pr.close();
                                file2.close();
                                break;
                            }
                            } catch (Exception e) {
                                e.printStackTrace();
                                break;
                            }
                            break;
                        case 2:
                            System.out.println("Descriptografar");
                            System.out.println("O arquivo a ser descriptografado é Q40cript.txt");
                         try {
                            File filer = new File("D:\\Projects\\Java\\listabruno\\q40\\q40cript.txt");
                           
                            if(filer.exists() &&  !filer.isDirectory()){
                                FileInputStream file = new FileInputStream(filer);
                                InputStreamReader reader = new InputStreamReader(file);
                                BufferedReader buffer = new BufferedReader(reader);
                                String linha;
                                while((linha = buffer.readLine()) != null){
                                    linha.toLowerCase();
                                    System.out.println(linha);
                                    char[] linhaChar = linha.toCharArray();
                                    
                                    for(int i = 0; i < linhaChar.length; i++){
                                        switch(linha.charAt(i)){
                                            case 'z':  
                                                linhaChar[i] = 'p';
                                                break;
                                            case 'p':
                                                linhaChar[i] = 'z';
                                                break;
                                            case 'e':  
                                                linhaChar[i] = 'o';
                                                break;
                                            case 'o':
                                                linhaChar[i] = 'e';
                                                break;
                                            case 'a':
                                                linhaChar[i] = 'i';
                                                break;
                                            case 'i':
                                                linhaChar[i] = 'a';
                                                break;
                                            case 'n':
                                                linhaChar[i] = 'l';
                                                break;
                                            case 'l':
                                                linhaChar[i] = 'n';
                                                break;
                                            case 't':
                                                linhaChar[i] = 'r';
                                                break;
                                            case 'r':
                                                linhaChar[i] = 't';
                                                break;
                                        }
                                    }
                                    linha = new String(linhaChar);
                                    System.out.println(linha);
                                    System.out.println("Escrevendo no arquivo...");
                                    FileOutputStream file2 = new FileOutputStream(new File("D:\\Projects\\Java\\listabruno\\q40\\q40descript.txt"));
                                    PrintWriter pr = new PrintWriter(file2);
                                        pr.println(linha);
                                    pr.close();
                                    file2.close();
                                    file.close();
                                    reader.close();
                                    buffer.close();

                                    break;
                                   }  
                             }
                                }

                         catch (Exception e) {
                            e.printStackTrace();
                            break;
                         }
                        break;
                        
                        case 0:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
            }

           
        }
}
