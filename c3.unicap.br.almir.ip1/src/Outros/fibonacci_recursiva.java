/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;
import java.util.Scanner;

public class fibonacci_recursiva {
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
