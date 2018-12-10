/*
Fatorial com recursividade!
 */
package Outros;

import java.util.Scanner;

public class fatorial_recursividade {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        System.out.print("N: ");
        n = in.nextInt();
        System.out.printf("Fat %d! = %d \n",n,(fat(n)));
    }
    
    static long fat (int n ){
        if (n == 0 || n == 1)
            return  1;
        else 
            return n * fat(n -1); 
    }
}
