/*
Lista3
Almir
1.Faça um programa que leia 2 números da entrada e imprima o resto da divisão
inteira de um pelo outro. 
*/
package lista3;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        // Chamar classe
        Scanner in = new Scanner(System.in);
        //Definir variaveis
        int num1,num2,div;
        //Entrada
        System.out.print("Digite um numero inteiro: ");
        num1 = in.nextInt();
        System.out.print("Digite um numero inteiro: ");
        num2 = in.nextInt();
        //Processamento
        div = num1%num2;
        //Saida
        System.out.println("A parte inteira da divisão é: "+div);
    }
    
}
