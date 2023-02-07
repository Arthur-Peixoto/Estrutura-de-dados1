package lista1respostas.exerciciosdeclasse;

public class Main33respostas {
	char letter;
    int quant;

    public static void main(String[] args) {
        String word = "casa";
        char[] wordChar = word.toCharArray(); //Transforma a String em um array de Char

        Main33respostas letra;

        for(int i=0;i<word.length();i++){
            letra = new Main33respostas(); //Instancia do objeto da classe
            letra.letter = wordChar[i];
            letra.quant++;

            //Este loop verifica se há letras repetidas
            for(int o=i+1;o<word.length();o++){
                //Caso haja entrará na condicional
                if(letra.letter == wordChar[o]){
                    letra.quant++; //Será adicionado mais 1 a quantidade total daquela letra
                    wordChar[o] = '0'; //E então o caracter repetido será substituido por 0 para não ser contado novamente
                }
            }

            //Irá mostrar todos os caracteres com suas quantidades sem mostrar todas as letras repetidas
            if(letra.letter != '0'){
                System.out.println(letra.letter+": "+letra.quant);
            }
        }

    }
}
