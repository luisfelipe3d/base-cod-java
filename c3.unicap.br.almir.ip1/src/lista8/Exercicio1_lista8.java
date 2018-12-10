/*
Exercicio :
1.Faça um programa em java para exibir todos os números inteiros pares
situados na faixa de 0 a 100. Para verificar se o número é par, o programa
deverá checar se o resto da divisão do número por 2 é igual a zero.
 */
package lista8;
import java.util.Scanner;

public class Exercicio1_lista8 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n=0;
        
        do {
            if (n%2 == 0)
                System.out.println("O número: "+n+" é par.");
            n++;
                
        } while (n < 101);
        
    }
    
}
