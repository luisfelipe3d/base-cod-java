/*
Exercicio ; 
Dados a razão de uma PA (Progressão Aritmética) e o valor do 1º termo, calcular 
e imprimir o 10º termo da série. 
AN = A1 + (n1-r).r
 */
package lista1;
import java.util.Scanner;

public class Exercicio1_ista1 {
    public static void main(String[] args) {
        //Definir variaveis
        int razao,a1, calculo;
        //Entrada de dados
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor para a razão: ");
        razao = in.nextInt();
        System.out.println("Digite o valor do primeiro termo: ");
        a1 = in.nextInt();
        //Processamento
        calculo = a1+(10-razao)*razao;
        //Saida
        System.out.println("O 10 termo da PA é "+calculo);
    }
}
