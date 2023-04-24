package lista3respostas.questoesTabelaHash;

import java.util.LinkedList;

public class Main04respostas {
    
    private int tamanho; // Tamanho da tabela hash
    private LinkedList<Item>[] tabela; // Array de listas encadeadas
    
    // Classe interna para representar um item da tabela hash
    private class Item {
        private int chave;
        private String valor;
        
        public Item(int chave, String valor) {
            this.chave = chave;
            this.valor = valor;
        }
        
        public int getChave() {
            return chave;
        }
        
        public String getValor() {
            return valor;
        }
    }
    
    // Construtor da tabela hash
    public Main04respostas(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new LinkedList[tamanho];
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new LinkedList<>();
        }
    }
    
    // Método para calcular o índice da chave na tabela hash
    private int hash(int chave) {
        return chave % tamanho;
    }
    
    // Método para adicionar um item na tabela hash
    public void adicionar(int chave, String valor) {
        int indice = hash(chave);
        for (Item item : tabela[indice]) {
            if (item.getChave() == chave) {
                // Atualiza o valor do item com a mesma chave
                item.valor = valor;
                return;
            }
        }
        tabela[indice].add(new Item(chave, valor));
    }
    
    // Método para buscar um item na tabela hash a partir da chave
    public String buscar(int chave) {
        int indice = hash(chave);
        for (Item item : tabela[indice]) {
            if (item.getChave() == chave) {
                return item.getValor();
            }
        }
        return null;
    }
    
    // Método para remover um item da tabela hash a partir da chave
    public void remover(int chave) {
        int indice = hash(chave);
        for (Item item : tabela[indice]) {
            if (item.getChave() == chave) {
                tabela[indice].remove(item);
                return;
            }
        }
    }
    
    public static void main(String[] args) {
        
        // Cria uma nova tabela hash com tamanho 5
        Main04respostas tabela = new Main04respostas(5);
        
        // Adiciona alguns itens na tabela hash
        tabela.adicionar(1, "Item 1");
        tabela.adicionar(2, "Item 2");
        tabela.adicionar(3, "Item 3");
        
        // Busca um item na tabela hash
        String valor = tabela.buscar(2);
        System.out.println("Valor do item com chave 2: " + valor);
        
        // Remove um item da tabela hash
        tabela.remover(1);
        
        // Adiciona outro item na tabela hash
        tabela.adicionar(4, "Item 4");
        
        // Busca outro item na tabela hash
        valor = tabela.buscar(1);
        System.out.println("Valor do item com chave 1: " + valor);
        
        // Imprime todos os itens da tabela hash
        for (int chave = 1; chave <= 5; chave++) {
            valor = tabela.buscar(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }
    }
}