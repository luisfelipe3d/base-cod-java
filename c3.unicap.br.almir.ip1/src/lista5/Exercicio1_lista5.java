/*
Faça um programa que solicite ao usuário um número real que esteja na
faixa entre 1 e 9 (inclusive). Após a leitura do valor 
fornecido pelo usuário, o programa deve exibir uma das duas mensagens:
“O valor está dentro da faixa permitida.”, caso o valor fornecido esteja
na faixa solicitada, ou “O valor não está dentro da faixa permitida.”, 
caso o usuário forneça valores não válidos. 
 */
package lista5;
import java.util.Scanner;
public class Exercicio1_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numero;
        
        //Recebe a entrada
        System.out.print("Digite um número entre 1,9 : ");
        numero = in.nextDouble();
        
        if(numero >=1 && numero <=9)
            System.out.println("O número está dentro da faixa permitida.");
        else
            System.out.println("O valor não está dentro da faixa permitida.");
    }
}
