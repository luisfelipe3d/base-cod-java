/*
Faça um programa que pegue 3 numeros e mostre em ordem decrescente
*/
package loaine_training;
import java.util.Scanner;

public class Exercicio9_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double num1,num2,num3;
        
        System.out.println("Num1: ");
        num1 = in.nextDouble();
        
        System.out.println("Num2: ");
        num2 = in.nextDouble();
        
        System.out.println("Num3: ");
        num3 = in.nextDouble();
        
        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            //num1 é menor
            //num3 é maior
            //num1 < num2 < num3
            System.out.println(num3+" - "+num2+" - "+num3+" ");
        }else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
            //num1 é menor
            //num2 é maior
            //num1 < num3 < num2 
        }
            
    }
}
