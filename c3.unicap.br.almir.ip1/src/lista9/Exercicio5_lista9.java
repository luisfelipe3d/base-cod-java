/*
Exercicio :
Faça um programa em JAVA para calcular e exibir a soma dos N primeiros 
números inteiros maiores que zero, onde N (quantidade de números a serem
somados) é um valor informado pelo usuário. */
package lista9;
import java.util.Scanner;

public class Exercicio5_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int qtd_num,soma=0,i;
        
        System.out.print("Qtd números a serem somados: ");
        qtd_num = in.nextInt();
        for(i = qtd_num; i >= 1;i--){
            soma= soma + qtd_num;
            System.out.print(""+qtd_num+",");
            qtd_num--;
        }
        System.out.printf("\nSoma: %d \n",soma);
    }
}
