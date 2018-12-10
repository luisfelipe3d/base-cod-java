/*
Exercicio :
O máximo divisor comum de dois números é o maior número que divide ambos
sem deixar resto. Escreva um programa em java que lê dois inteiros positivos
(ou seja, maiores que zero) e calcula o seu máximo divisor comum.
 */
package lista8;
import java.util.Scanner;

public class Exercicio10_lista8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1,num2, mdc=0,i, div, result = 0;
 
        do {
            System.out.println("Digite um inteiro positivo. ");
            System.out.println("Num: ");
            num1 = in.nextInt();
            num2 = in.nextInt();
            
            
        } while (num1 <= 0 && num2 <= 0);
           
        if (num1 < num2) {
            div = num1;
        }  else {
            div = num2;
        }
        
        do {
            if (num1 % div == 0 && num2 % div == 0) {
                result = div;
            } else {
                div--;
            }
        } while (result == 0);
        
        System.out.println("O mdc é: " + result);
    }
}
