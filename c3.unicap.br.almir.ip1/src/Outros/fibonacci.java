/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int fib1=1, fib2=1, fib, n_termos;
        System.out.println("Digite um número: ");
        n_termos = in.nextInt();
        System.out.print("Fib = "+fib1+" , "+fib2);
        for (int i = 3; i <= n_termos;i++){
            fib = fib1 + fib2;
            System.out.print(", "+ fib);
            fib1= fib2;
            fib2 = fib;
        }
        System.out.println("");
        
    }
}
