/*
Lista 4
Almir
Faça um programa para ler dois números inteiros e calcular a diferença
entre o maior e o menor. O programa deve exibir apenas uma das 
seguintes frases: 
•O maior número é ___________, o menor número é ___________ e 
a diferença entre eles é __________. 
•Os números são iguais, a diferença entre eles é zero. 
 */
package lista4;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        int num1,num2;
        
        //Entrada
        System.out.println("Digite um número: ");
        num1 = in.nextInt();
        System.out.println("Digite um número: ");
        num2 = in.nextInt();
        
        //Processamento e saida
        
        if (num1 > num2) 
            System.out.printf("O maior número é: %d, o menor "
                    + "número é %d e a diferença entre eles é: %d\n",num1,num2,(num1-num2));
        else if (num2 > num1)
            System.out.printf("O maior número é: %d, o menor "
                    + "número é %d e a diferença entre eles é: %d\n",num2,num1,(num2-num1));
        else
            System.out.println("Os números são iguais, a diferença entre eles é zero.\n");
    }
}
