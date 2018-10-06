/*
Lista5
Almir
9.Faça um programa para ler três números reais e determinar
qual o menor deles. Considere que os três números podem ou 
não ser diferentes entre si. 
*/
package lista5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1,num2,num3;
        
        System.out.println("Num1: ");
        num1 = in.nextDouble();
        System.out.println("Num2: ");
        num2 = in.nextDouble();
        System.out.println("Num3: ");
        num3 = in.nextDouble();
        
        if (num1 <= num2 && num1 <= num3)
            System.out.println("O menor é: "+num1);
        else if (num2 <= num3)
            System.out.println("O menor é: "+num2);
        else
            System.out.println("O menor é: "+num3);
    }
}
