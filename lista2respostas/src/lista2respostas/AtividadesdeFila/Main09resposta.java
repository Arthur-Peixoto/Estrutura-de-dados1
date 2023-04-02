package lista2respostas.AtividadesdeFila;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main09resposta {
	
	    
	    public static void main(String[] args) {
	        
	        int[][] matrizDistancias = {{0, 3, 0, 0, 0},
	                                    {0, 0, 1, 0, 0},
	                                    {0, 0, 0, 1, 0},
	                                    {0, 0, 2, 0, 1},
	                                    {1, 0, 0, 0, 0},
	                                    {0, 1, 0, 0, 0}};
	        
	        int cidadeInicial = 0;
	        
	        int[] vetorResultado = new int[matrizDistancias.length];
	        Arrays.fill(vetorResultado, -1);
	        vetorResultado[cidadeInicial] = 0;
	        
	        Queue<Integer> fila = new LinkedList<>();
	        fila.add(cidadeInicial);
	        
	        while (!fila.isEmpty()) {
	            int cidadeAtual = fila.remove();
	            for (int cidadeVisitada = 0; cidadeVisitada < matrizDistancias.length; cidadeVisitada++) {
	                int distancia = matrizDistancias[cidadeAtual][cidadeVisitada];
	                if (distancia > 0 && vetorResultado[cidadeVisitada] == -1) {
	                    vetorResultado[cidadeVisitada] = vetorResultado[cidadeAtual] + distancia;
	                    fila.add(cidadeVisitada);
	                }
	            }
	        }
	        
	        for (int i = 0; i < vetorResultado.length; i++) {
	            System.out.println("Distância da cidade " + cidadeInicial + " para a cidade " + i + ": " + vetorResultado[i]);
	        }
	    }
	    
}

