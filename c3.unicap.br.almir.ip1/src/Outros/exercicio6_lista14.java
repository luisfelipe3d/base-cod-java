/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;

import java.util.Scanner;

public class exercicio6_lista14 {
    
    static void seqN(int n1, int n2, int n3, int n){
        int prox;
        System.out.print(n1+", "+n2+", "+n3);
        for (int i =4; i <=n ; i++){
            prox = n1+n2+n3;
            System.out.print(", "+prox);
            n1 = n2;
            n2 = n3;
            n3 = prox;
        }
        System.out.println("");
    }
    
    static int seq(int n){
        if (n == 1)
            return 2;
        else if (n == 2)
            return 3;
        else if (n == 3)
            return 4;
        else
            return seq(n-1) + seq(n-2) + seq(n-3);
    }
    
    static int seqRec(int n1, int n2, int n3, int n){
        if (n == 1)
            return n1;
        else if (n == 2)
            return n2;
        else if (n == 3)
            return n3;
        else
            return seqRec(n1,n2,n3, n-1) + seqRec(n1,n2,n3, n-2) +
                    seqRec(n1,n2,n3, n-3);
    }
    
    static void seq(int n1, int n2, int n3, int n){
        for (int i = 1; i<= n ; i++){
            System.out.print(seqRec(n1,n2,n3, i)+ ", ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n1,n2,n3,termos;
        System.out.print("N:");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        System.out.println("Termos: ");
        termos = in.nextInt();
        seq(n1,n2,n3,termos);
    }
}
