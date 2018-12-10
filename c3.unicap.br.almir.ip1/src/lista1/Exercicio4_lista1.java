/*
Exercicio :
Dada uma temperatura em graus Centígrados, apresentá-la convertida em graus 
Fahrenheit. A fórmula de conversão é: F = 9*C+160/5 ;
Onde, F é a temperatura em Fahrenheit e C é a temperatura em centígrados. 
*/
package lista1;
import java.util.Scanner;

public class Exercicio4_lista1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Definir variaveis
        double grau_c,cal,grau_fah;
        //Entrada
        System.out.print("Digite o valor da temperatura em graus Centígrados: ");
        grau_c = in.nextDouble();
        // Processamento
        cal = (9*grau_c+160)/5;
        //Saida
        System.out.printf("Temperatura ºC: %.2f.\n",grau_c);
        System.out.printf("Temperatur ºF: %.2f.\n",cal);
    }
}
