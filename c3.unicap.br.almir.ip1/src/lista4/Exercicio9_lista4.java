/*
Exercicio :
Faça um programa para ler a idade de uma pessoa e determinar 
se esta pessoa é ou não maior de idade (idade maior ou igual a 18 
anos). O programa deve imprimir a seguinte frase: Esta pessoa
tem ________ anos e [é / não é]maior de idade. 
 */
package lista4;
import java.util.Scanner;

public class Exercicio9_lista4 {
    public static void main(String[] args) {
        //Definir variávies
        Scanner in = new Scanner(System.in);
        int idade;
        
        //Entrada
        System.out.println("Digite sua idade: ");
        idade = in.nextInt();
        //Processamento
        if (idade >= 18)
            System.out.printf("Esta pessoa tem %d anos e é maior de "
                    + "idade.\n",idade);
        else
            System.out.printf("Esta pessoa tem %d anos e não é maior de "
                    + "idade.\n",idade);

    }
}
