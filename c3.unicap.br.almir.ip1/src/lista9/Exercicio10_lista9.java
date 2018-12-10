/*
Exercicio :
Faça um programa em java para solicitar N(número inteiro maior que zero)
e calcular o valor de S, dado por :
S = 1/n + 2/n-1 + 3/n-2 + ... + n-1/2 + n/1
 */
package lista9;
import java.util.Scanner;

public class Exercicio10_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double n,s=0,i,j;
        
        System.out.print("Informe N: ");
        n = in.nextDouble();
        if (n <= 0)
            System.out.println("Valor incorreto. Por favor informe valor posi"
                    + "tivo. ");
        else{
            j = n;
            for (i = 1; i<= n; i++){
                s = s + (i/j);
                j--;
                System.out.println(s);
                
            }
        }
        System.out.println("Total: "+s);
    }
}
