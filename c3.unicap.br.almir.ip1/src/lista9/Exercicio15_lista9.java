/*
Exercicio :
Faça um programa em JAVA para solicitar um número inteiro ao usuário
e calcular e exibir o fatorial deste número. Lembretes:
• 0! = 1
• 1! = 1
• Se N > 1, então N! = N * N-1 * N-2 * ... * 2 * 1
• Não existe fatorial de número negativo. 
*/
package lista9;
import java.util.Scanner;

public class Exercicio15_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        long n,fat=1,i;
        
        System.out.print("Informe número: ");
        n = in.nextLong();
        if (n < 0)
            System.out.println("Não existe fatorial de número negativo");
        else{
            if (n == 1 || n == 0)
                System.out.printf("Fat(%d): %d\n",n,1);
            
            for (i = 1; i <= n; i++){
                fat =  n * n-i;
                System.out.println(fat);
            }
            System.out.printf("Fat(%d): %d\n",n,fat);
        }
            
        
    }
}
