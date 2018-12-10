/*
Exercicio :
Sendo H = 1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n, fazer um programa para 
solicitar n (número inteiro maior que zero) e gerar o número H.
*/
package lista9;
import java.util.Scanner;

public class Exercicio9_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num;
        
        System.out.print("Num: ");
        num = in.nextInt();
        System.out.print("H:");
        for (double i = 1; i<= num; i++){
            System.out.print(1/i+", ");
            
        }
    }
}
