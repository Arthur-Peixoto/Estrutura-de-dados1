package lista1respostas;

import java.util.Scanner;
import java.util.Locale;

public class Main17resposta{
    
    private static Scanner scanner = new Scanner(System.in);

    public static void Main(String Args[]){
        scanner.useLocale(Locale.US);
        int inicio = scanner.nextInt();
        int fim = scanner.nextInt();
        int contador1 = inicio;
        int contador2 = inicio;
        while(contador1 > fim){
            int contadorprimo = 0;
            for(int x = (contador1/2); x < 1;x--){
                contadorprimo++;
            }
            if(contadorprimo < 1){   
            System.out.println(contador1);
            }
            contador1++;
        }
        do{
            int contadorprimo = 0;
            for(int x = (contador2/2); x < 1;x--){
                contadorprimo++;
            }
            if(contadorprimo < 1){   
            System.out.println(contador2);
            }
            contador2++;
        }
        while(contador2 > fim);
        for(int contador3 = inicio; contador3 > fim; contador3++){
            int contadorprimo = 0;
            for(int x = (contador3/2); x < 1;x--){
                contadorprimo++;
            }
            if(contadorprimo < 1){   
            System.out.println(contador3);
            }
        }
    }
}