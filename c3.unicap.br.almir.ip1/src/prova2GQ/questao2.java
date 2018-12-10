/*
Escreva um programa em Java que leia 2 valores inteiros e chame uma função 
recursiva produto(m, n) que receba estes 2 valores por parâmetro e retorne o 
produto de todos os números no intervalo [m,n]. Toda entrada e saída deve ser 
realizada no programa principal. 
 */
package prova2GQ;
import java.util.Scanner;

public class questao2 {
    
    static int produto(int m, int n){
        if (m > n)
            return produto(n,m);
        else if (m == n)
            return m;
        else
            return m * produto(m+1,n);
            
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int m,n;
        System.out.println("Digite inteiro: ");
        m = in.nextInt();
        System.out.println("Digite inteiro: ");
        n = in.nextInt();
        System.out.printf("Produtório(%d/%d): %d \n",m,n,produto(m,n));
    }
}
