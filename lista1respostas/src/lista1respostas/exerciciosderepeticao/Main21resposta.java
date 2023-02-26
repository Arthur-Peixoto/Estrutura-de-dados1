package lista1respostas.exerciciosderepeticao;

import java.util.Scanner;
import java.util.Locale;

class primo{
    int n;
    int contador;
    boolean testePrimo(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                contador++;
            }
        }
        if(contador >2){
            return false;
        }else{
            return true;
        }
    }
}
public class Main21resposta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = in.nextInt();
        primo primo = new primo();
        if(primo.testePrimo(n)){
            System.out.println("O número é primo");
        }else{
            System.out.println("O número não é primo");
        }
        in.close();
    }
}
