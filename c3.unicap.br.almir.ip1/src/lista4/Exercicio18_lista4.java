/*
Exercicio :
Escrever um algoritmo que leia 2 valores inteiros e um caracter 
e realize uma das quatro operações aritméticas básicas entre estes 
dois valores. A operação a ser realizada é dada pelo caracter 
(+, -, *, /). 
 */
package lista4;
import java.util.Scanner;

public class Exercicio18_lista4 {
    public static void main(String[] args) {
        //Definir variaveis
        Scanner in = new Scanner(System.in);
        int num1,num2,escolha;
        
        //Entrada
        System.out.println("Digite um valor: ");
        num1 = in.nextInt();
        System.out.println("Digite um valor: ");
        num2 = in.nextInt();
        System.out.println("Qual operação deseja realizar: \n"
                + "1. Soma\n"
                + "2. Subtração\n"
                + "3. Divisão\n"
                + "4. Multiplicação\n");
        escolha = in.nextInt();
        
        //Processamento
        if (escolha == 1) {
            System.out.printf("Soma: %d",(num1+num2));
        } else if (escolha == 2) {
            System.out.printf("Subtração: %d",(num1-num2));
        } else if (escolha == 3) {
            System.out.printf("Divisão: %d ",(num1/num2));
        } else if (escolha == 4) {
            System.out.printf("Multiplicação: %d ",(num1*num2));
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
