/*
Exercicio :
Escreva um programa em JAVA que coloque na tela meia árvore de Natal
com asteriscos. O número de ramos deverá ser introduzido pelo usuário.
Exemplos com 3,4 e 5 ramos:

*       *           *
**      **          **
***     ***         ***
        ****        ****
                    *****
 */
package lista7;
import java.util.Scanner;

public class Exercicio7_lista7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n,i=1;
        
        System.out.print("Digite o número de ramos: ");
        n = in.nextInt();

        while (i <= n){
            int j =1;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println("");
        }
    }
}
