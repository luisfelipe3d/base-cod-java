/*
Exercicio :
Calcule e imprima a área de um triângulo sabendo que são fornecidas a sua base 
e altura. 
 */
package lista1;
import java.util.Scanner;

public class Exercicio2_lista1 {
    public static void main(String[] args) {
        //Definir variaveis
        int base,altura,calculo;
        Scanner in = new Scanner(System.in);
        //Entrada
        System.out.println("Digite a area da base: ");
        base = in.nextInt();
        System.out.println("Digite o numero da altura: ");
        altura = in.nextInt();
        //Processamento
        calculo = (base*altura)/2;
        //Saida
        System.out.println("A area do triangulo é: "+calculo);
    }
}
