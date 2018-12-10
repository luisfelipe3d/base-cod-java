/*

 */
package Outros;
import java.util.Scanner;

public class mdc_recursiva {
    
    static int mdc(int x, int y){
        if (x == y)
            return x;
        else if (x < y)
            return mdc(y,x);
        else
            return mdc(x-y, y);
    }
    
    static int mdcI(int x, int y){
        int aux;
        while (x != y){
            if (x > y)
                x = x - y;
            else{
                aux = x;
                x = y;
                y = aux;
            }
                
        }
        return x;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n , m;
        System.out.print("Digite n: ");
        n = in.nextInt();
        System.out.print("Digite m: ");
        m = in.nextInt();
        System.out.printf("MDC: %d, %d = %d\n",n,m,(mdcI(n,m)));
        
    }
}
