/*
Faça um programa em JAVA que receba um valor inteiro para x, calcule e imprima
o valor de f(x) de acordo com as opções abaixo:
f(x) = x + 1, se 0 < x <= 1
f(x) = 2x, se 1 < x <= 2
f(x) = x², se 2 < x <= 3
f(x) = x³, se x > 3
Se não estiver em nenhuma das opções acima, exibir mensagem de erro informando
ao usuário que é impossível calcular f(x).
 */
package prova1GQ;
import java.util.Scanner;

public class questao1_prova1gq {

   public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x,f;
        
        System.out.println("Digite x > 0: ");
        x = in.nextInt();
            
        if (x > 0 && x <=1){
            f = x+1;
            System.out.println("F("+x+") = "+ f);
        }else if (x > 1 && x <=2){
            f = 2*x;
            System.out.println("F("+x+") = "+ f);
        }else if (x >2 && x<=3){
            f = (int) Math.pow(x,2);
            System.out.println("F("+x+") = "+ f);
        }else if ( x > 3){
            f = (int) Math.pow(x,3);
            System.out.println("F("+x+") = "+ f);
        } else
            System.out.println("Impossível calcular f(x).");

    }
    
}
