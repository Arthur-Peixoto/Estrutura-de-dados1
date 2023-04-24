package lista3respostas.questoesTabelaHash;

public class Main05respostas {

	    private int tamanho;
	    private String[] tabela;

	    public Main05respostas(int tamanho) {
	        this.tamanho = tamanho;
	        this.tabela = new String[tamanho];
	    }

	    public void adicionar(String valor) {
	        int indice = funcaoHash(valor);
	        int i = 0;

	        while (tabela[(indice + i) % tamanho] != null) {
	            i++;
	        }

	        tabela[(indice + i) % tamanho] = valor;
	    }

	    public boolean buscar(String valor) {
	        int indice = funcaoHash(valor);
	        int i = 0;

	        while (tabela[(indice + i) % tamanho] != null) {
	            if (tabela[(indice + i) % tamanho].equals(valor)) {
	                return true;
	            }
	            i++;
	        }

	        return false;
	    }

	    private int funcaoHash(String valor) {
	        int hash = 0;
	        for (int i = 0; i < valor.length(); i++) {
	            hash = (hash * 31 + valor.charAt(i)) % tamanho;
	        }
	        return hash;
	    }
	
	public static void main(String[] args) {

        // Cria uma nova tabela hash com tamanho 10
        Main05respostas tabela = new Main05respostas(10);

        // Adiciona alguns valores na tabela hash
        tabela.adicionar("valor1");
        tabela.adicionar("valor2");
        tabela.adicionar("valor3");

        // Busca um valor na tabela hash
        boolean encontrado = tabela.buscar("valor2");
        System.out.println("Valor encontrado: " + encontrado);

        // Busca um valor que não está na tabela hash
        encontrado = tabela.buscar("valor4");
        System.out.println("Valor encontrado: " + encontrado);

        // Adiciona mais valores na tabela hash
        tabela.adicionar("valor4");
        tabela.adicionar("valor5");

        // Busca um valor que foi adicionado após uma colisão
        encontrado = tabela.buscar("valor1");
        System.out.println("Valor encontrado: " + encontrado);
    }

}
