/*
Multiplicação recursiva
 */
package Outros;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class multipliacao_recursiva {
    static int mux(int n, int m){
        if (n == 0 || m == 0)
            return 0;
        return n + mux(n, m-1);
    }
    static int div(int n, int m){
        if ( n < m )
            return 0;
        else
            return 1 + div(n-m, m);

    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1,num2;
        
        System.out.print("Num: ");
        num1 = in.nextInt();
        System.out.print("Num: ");
        num2 = in.nextInt();
        System.out.printf("Mux(%d,%d): %d\n",num1,num2,mux(num1,num2));
        System.out.printf("Div(%d,%d): %d\n",num1,num2,div(num1,num2));
    }
}
