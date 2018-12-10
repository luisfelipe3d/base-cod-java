/*
Exercicio :
Calcular a quantidade de litros de combustível gastos em uma viagem, sabendo-se 
que o carro faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto na
viagem e a velocidade média. O algoritmo deverá apresentar os valores da 
velocidade média, o tempo gasto na viagem, a distância percorrida e a quantidade
de litros utilizada na viagem. Utilizar a seguinte fórmula: 
distância = tempo x velocidade média 
*/
package lista1;
import java.util.Scanner;

public class Exercicio5_lista1 {
    public static void main(String[] args) {
        //Chamar a função scanner
        Scanner in = new Scanner(System.in);
        // Definir variavies
        int tempo, vlc_media, dst;
        float litros;
        //Entrada
        System.out.print("Digite o tempo da viagem: ");
        tempo = in.nextInt();
        System.out.print("Informe a velocidade média: ");
        vlc_media = in.nextInt();
        //Processamento distância = tempo * velocidade média
        dst = tempo*vlc_media;
        litros = (dst*1)/12;
        // Saida
        System.out.println("A velocidade média: "+vlc_media);
        System.out.println("O tempo da viagem: "+tempo);
        System.out.println("Distância percorrida: "+dst);
        System.out.println("Quantidade de litros utilizados: "+litros);
    }
}
