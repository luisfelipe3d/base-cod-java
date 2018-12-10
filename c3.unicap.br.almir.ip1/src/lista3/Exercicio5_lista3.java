/*
Exercicio:
Dado um número em ponto-flutuante, exiba a sua parte inteira, a sua
parte fracionária e o arredondamento desse número. 
 */
package lista3;
import java.util.Scanner;

public class Exercicio5_lista3 {
    public static void main(String[] args) {
        //Definir variávies
        Scanner in = new Scanner(System.in);
        int inteiro;
        double entrada,fracionada;
        
        //Entrada
        System.out.println("Digite um número ponto-flutuante (4.35): ");
        entrada = in.nextDouble();
        
        //Processamento
        inteiro = (int) entrada;
        fracionada = entrada - inteiro;
        
        //Saida
        System.out.println("Inteiro: "+inteiro);
        System.out.printf("Fracionado: %.2f\n",fracionada);
        // Arredonda para CIMA.
        System.out.println("Número arredondando para cima: "+Math.ceil(entrada));
        // Arredonda para BAIXO.
        System.out.println("Número arredondando para baixo: "+Math.floor(entrada));
        // Até 0.49 arredonda para baixo
        System.out.println("Arredondamento"+Math.round(entrada));
    }
}
