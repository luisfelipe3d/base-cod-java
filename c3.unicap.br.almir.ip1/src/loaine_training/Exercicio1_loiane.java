/* Switch case
Loaine.training
1. Faça um exercicio que peça dois números e imprima o maior deles.
 */
package loaine_training;
import java.util.Scanner;

public class Exercicio1_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1,num2;
        
        System.out.println("Num1: ");
        num1 = in.nextInt();
        System.out.println("Num2: ");
        num2 = in.nextInt();
        
        if (num1 > num2)
            System.out.println("O maior número: "+num1);
        else
            System.out.println("O maior número: "+num2);
        
        
    }
    
}
