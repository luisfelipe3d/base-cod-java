/*
Exercicio:
Faça um programa para gerar e imprimir N termos da série de Fibonacci. 
O valor de N deve ser fornecido pelo usuário. 
Série de Fibonacci 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

A série de Fibonacci pode ser definida recursivamente por:
fib(n) = 1, n = 1, n = 2
        fib(n-1) + fib(n-2), n > 2
O programa deve conter os seguintes subprogramas: 
a)Uma função recursiva que gere o termo de ordem N da série de Fibonacci; 
b)Um procedimento não recursivo que, utilizando a função definida em (a), 
gere a série de Fibonacci até o termo de ordem N.

*/
package lista14;
import java.util.Scanner;

public class Exercicio5_lista14 {
    
   static int fib(int n){
        if (n == 1 || n == 2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    
    static int somafib(int n){
        int soma = 0;
        for (int i = 1; i <= n; i++)
            soma = soma +fib(i);
        return soma;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        System.out.print("Digite valor: ");
        n = in.nextInt();
        System.out.printf("fib(%d): %d\n",n,fib(n));
        System.out.printf("Soma fib(%d): %d\n",n,somafib(n));
    }
}
