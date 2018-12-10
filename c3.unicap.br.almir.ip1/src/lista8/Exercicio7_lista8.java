/*
Exercicio :
Faça um programa em JAVA para soliciar ao usuário vários números inteiros
positivos e determinar qual o maior e menor deles. O programa deve parar de
solicitar números quando for digitado um valor igual a zero.
 */
package lista8;
import java.util.Scanner;

public class Exercicio7_lista8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int entrada,maiorN=0,menorN=Integer.MAX_VALUE;
        
        do {
            System.out.println("Digite um número: ");
            entrada = in.nextInt();
            if (entrada > maiorN)
                maiorN = entrada;
            if (entrada == 0)
                System.out.println("Fim do programa.");
            else if (entrada < menorN)
                menorN = entrada;
            
            
        } while (entrada != 0);
        System.out.println("Maior: "+maiorN);
        System.out.println("Menor: "+menorN);
    }
}
