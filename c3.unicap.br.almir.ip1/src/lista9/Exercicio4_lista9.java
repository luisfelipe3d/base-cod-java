/*
Exercicio :
Faça um programa em JAVA para ler a idade de 20 pessoas e calcular
e exibir quantas destas pessoas possuem idade entre 18 e 35 anos. 
 */
package lista9;
import java.util.Scanner;

public class Exercicio4_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int i,cont=0,idade;
        
        for(i = 1; i<=20;i++){
            System.out.print("Digite sua idade: ");
            idade = in.nextInt();
            if (idade >= 18 && idade < 36)
                cont++;
        }
        System.out.printf("Quantidade de pessoas entre 18 e 35: %d\n",cont);
        
    }
}
