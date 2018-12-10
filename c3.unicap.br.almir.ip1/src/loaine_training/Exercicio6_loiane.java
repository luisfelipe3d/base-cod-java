/*
Faça um programa que leia três números e mostre o maior deles
*/
package loaine_training;
import java.util.Scanner;

public class Exercicio6_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1,num2,num3;
        
        System.out.println("Num: ");
        num1 = in.nextInt();
        System.out.println("Num: ");
        num2 = in.nextInt();
        System.out.println("Num: ");
        num3 = in.nextInt();
        
        if (num1 > num2 && num1> num3 )
            System.out.println("Num maior: "+num1);
        else if (num2 > num3)
            System.out.println("Num maior: "+num2);
        else
            System.out.println("Num maior: "+num3);
    }
}
