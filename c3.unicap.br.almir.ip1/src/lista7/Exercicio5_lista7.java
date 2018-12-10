/*
Exercicio :
Reescreva o programa anterior de modo a apresentar a tabuada
de qualquer número introduzido pelo usuário. 
 */
package lista7;
import java.util.Scanner;

public class Exercicio5_lista7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double aux=0,j=1;
        System.out.print("Digite um número qualquer: ");
        aux = in.nextDouble();
        
        while (j != 11){
            System.out.println(aux+" X "+j+" = "+(aux*j));
            j++;
        }
    }
}
