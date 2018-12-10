/*
Exercicio:
Definia um procedimento recursivo para, dado um número natural n, 
imprimi-lo em base binária.
 */
package lista14;
import java.util.Scanner;
public class Exercicio3_lista14 {

    static void binario(int n){
        if (n/2 == 0)
            System.out.print(n%2);
        else{
            binario(n/2);
            System.out.print(n%2);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int entrada;
        System.out.print("Num: ");
        entrada = in.nextInt();
        binario(entrada);
        System.out.println("");
    }
    
}
