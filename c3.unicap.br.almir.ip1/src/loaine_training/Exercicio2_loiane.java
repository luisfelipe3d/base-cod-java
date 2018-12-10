/*
Faça um programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
 */
package loaine_training;
import java.util.Scanner;

public class Exercicio2_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num;
        
        System.out.println("Digite um número: ");
        num = in.nextInt();
        
        if (num >= 0)
            System.out.println("Valor posivito.");
        else
            System.out.println("Valor negativo.");
    }
}
