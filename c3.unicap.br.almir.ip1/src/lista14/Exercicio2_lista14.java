/*
Exercicio:
Faça um programa para calcular o máximo divisor comum (MDC) de dois números 
naturais. Para isto,defina uma função recursiva que irá calcular o MDC de x e y,
baseando-se nas regras abaixo. 
1) MDC (x,y) = x        se x = y
2) MDC (x,y) = MDC(y,x) se x < y
3) MDC (x,y) = MDC(x-y,y)  se x > y

Exemplo: MDC(12,4) = MDC(8,4) = MDC(4,4) = 4 
*/
package lista14;
import java.util.Scanner;

public class Exercicio2_lista14 {
    
    static int mdc(int x, int y){
        if (x == y)
            return x;
        else if (x < y)
            return mdc(y,x);
        else
            return mdc(x-y, y);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n , m;
        System.out.print("Digite n: ");
        n = in.nextInt();
        System.out.print("Digite m: ");
        m = in.nextInt();
        System.out.printf("MDC: %d, %d = %d\n",n,m,(mdc(n,m)));
        
    }
}

