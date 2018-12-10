/*
Exercicio:
Dada uma quantidade de chuva em polegadas, calcular e exibir a quantidade
equivalente em milímetros.
Obs.: 25,4 mm = 1 polegada. 
 */
package lista3;
import java.util.Scanner;

public class Exercicio6_lista3 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        double entrada,aux;
        //Entrada
        System.out.println("Qtd de chuva em polegadas: ");
        entrada = in.nextDouble();
        //Processamento
        aux = entrada*25.4;
        //Saida
        System.out.printf("Polegadas para milímetros: %.2f \n",aux);
    }
}
