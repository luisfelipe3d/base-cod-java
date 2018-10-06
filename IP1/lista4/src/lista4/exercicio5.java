/*
Lista 4
Almir
5.
Faça um programa que receba três números do usuário e verifique 
se o terceiro é a soma dos outros dois: caso seja, o programa 
emitirá a mensagem: “Operação correta!”; senão, a mensagem
será “Você cometeu um engano...”. 
*/
package lista4;
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        //Definir variávies
        Scanner in = new Scanner(System.in);
        int num1,num2,soma;
        
        //Entrada
        System.out.println("Digite um número: ");
        num1 = in.nextInt();
        System.out.println("Digite um número: ");
        num2 = in.nextInt();
        System.out.println("Digite soma dos dois números: ");
        soma = in.nextInt();
        //Processamento e saida
        if (num1 + num2 == soma) 
            System.out.println("Operação correta");
         else 
            System.out.println("Você cometeu um engano...");
        
    }
}
