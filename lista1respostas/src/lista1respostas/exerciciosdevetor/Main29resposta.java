package lista1respostas.exerciciosdevetor;

public class Main29resposta {
    public static void main(String[] args) {
        int[] arr = {8,2,1,5,6}; //Array com os valores a serem verificados
        int index = 2; //Index do valor no qual devemos começar a verificação
        int cont = index;
        int value = 0; //Variável para salvar o valor de um index e passar para o outro

        //Loop para verificar se o valor anterior ao selecionado é maior que ele
        for(int i=0;i<index;i++){
            //Caso seja maior entrará na condicional para trocá-los de posição
            if(arr[cont] < arr[cont-1]){
                value = arr[cont];
                arr[cont] = arr[cont-1];
                arr[cont-1] = value;
                cont--;
            }
        }

        //Loop para escrever o array após a mudança
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }    
}
