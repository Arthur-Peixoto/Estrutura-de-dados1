package lista1respostas.exerciciosdevetor;

import java.util.Random;

public class Main29resposta {
    public static void main(String[] args) {
    	Random random = new Random();
    	int z = 0;
    	int[] quant = new int[5]; 
    	int[] invert = new int[quant.length];
    	for(int i = 0; i < quant.length; i++) {
    		quant[i] = random.nextInt(10);
    		System.out.println("num: "+ quant[i]);
    		}
    	for(int x = quant.length-1; x > -1; x--) {
			invert[z] = quant[x];
			System.out.println(invert[z] + " " + z);
			z+=1;
    	}
    	for(int i = 0; i < quant.length;i++) {
    		for(int x = quant.length-1; x > -1; x--) {
    			if(invert[x]<quant[i]) {
    				int variavel = quant[i];
    				quant[i] = invert[x];
    				invert[x] = variavel;
    			}
    		}
    		System.out.println(quant[i]);;
    	}
    }
}
