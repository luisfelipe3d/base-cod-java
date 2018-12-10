/*
Exercicio :
Faça um programa em JAVA para ler N números inteiros e calcular 
e exibir a soma dos números lidos. No programa, N (que representa 
a quantidade de números a serem lidos) é um valor informado pelo usuário. 
*/
package lista9;
import java.util.Scanner;

public class Exercicio6_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int qtd_num,num,soma=0;
        
        System.out.print("Qtd Números: ");
        qtd_num = in.nextInt();
        
        for (int i = 1; i <= qtd_num; i++){
            System.out.print("Num: ");
            num = in.nextInt();
            soma = soma + num;
        }
        System.out.println("Soma: "+soma);
    }
}
