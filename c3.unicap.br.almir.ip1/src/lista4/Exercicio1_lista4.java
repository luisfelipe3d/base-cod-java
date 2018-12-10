/*
Exercicio :
Faça um programa que leia 2 valores numéricos e informe qual é o menor deles.
 */
package lista4;
import java.util.Scanner;

public class Exercicio1_lista4 {
    public static void main(String[] args) {
        //Definir variávies
        Scanner in = new Scanner(System.in);
        int num1, num2;
        
        //Entrada
        System.out.println("Digite um número: ");
        num1 = in.nextInt();
        System.out.println("Digite um número: ");
        num2 = in.nextInt();
        
        //Processamento
        if (num1 > num2)
            System.out.println("O menor número é: "+num2);
        else if (num1 == num2)
            System.out.println("O PRIMEIRO NÚMERO É IGUAL AO SEGUNDO");
        
        else 
            System.out.println("O menor número é: "+num1);
        
    }
}
