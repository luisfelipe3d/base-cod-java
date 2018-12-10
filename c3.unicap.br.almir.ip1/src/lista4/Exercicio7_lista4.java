/*
Exercicio :
Faça um programa para ler dois números inteiros M e N e determinar 
se M é divisível por N. Utilize na solução apresentada o 
seguinte fato: se o resto da divisão de M por N é 0 (zero),
então M é divisível por N. 
 */
package lista4;
import java.util.Scanner;

public class Exercicio7_lista4 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        int m,n;
        
        //Entrada
        System.out.println("Digite um número: ");
        m = in.nextInt();
        System.out.println("Digite um número: ");
        n = in.nextInt();
        //Processamento
        if (m % n == 0) 
            System.out.printf("%d é divisível por %d\n",m,n);
        else
            System.out.printf("%d não é divisível por %d\n",m,n);
        
    }
}
