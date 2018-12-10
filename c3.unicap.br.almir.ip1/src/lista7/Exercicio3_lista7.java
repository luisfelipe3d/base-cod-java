/*
Exercicio :
Escreva um programa em JAVA que solicite um número
ao usuário até que o valor digitado esteja entre os 
valores 1 e 100. 
 */
package lista7;
import java.util.Scanner;

public class Exercicio3_lista7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int entrada=3000;
        
        while (entrada > 100 || entrada < 1){
            System.out.println("Digite um número: ");
            entrada = in.nextInt();
            if (entrada > 100 || entrada < 1)
                System.out.println("Para sair do programa digite um número entre 1 e 100.");
  
        }
        System.out.println("Programa Finalizado.");
    }
}
