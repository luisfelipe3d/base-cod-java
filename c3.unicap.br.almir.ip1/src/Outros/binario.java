/*
procedimento recursivo
 */
package Outros;
import java.util.Scanner;
public class binario {
    static int binario(int num){
     if (num / 2 == 0)
         return num%2;
     else
         return 10 * binario(num/2)+ (num%2);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num;
        
        System.out.print("Digite valor decimal: ");
        num = in.nextInt();
        System.out.printf("Binario (%d): %d\n",num,binario(num));
        
    }
}
