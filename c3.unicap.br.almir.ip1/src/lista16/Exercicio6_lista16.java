/*
Lista 16
*/
package lista16;
import java.util.Scanner;

public class Exercicio6_lista16 {
    
    static boolean primos(int n, int m){
        if (mdc(n,m) == 1)
            return true;
        else
            return false;
            
    }
    
    public int mdc(int x, int y){
        int cont;
        if (x > y)
            cont = y;
        else
            cont = x;
        while (cont > 1 && (x % cont != 0 || y % cont != 0)){
            cont--;
        }
        return cont;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1,num2;
        
        System.out.print("Num: ");
        num1 = in.nextInt();
        System.out.print("Num: ");
        num2 = in.nextInt();
        
        
    }
}
