/*
Exercicio :
Escreva um programa em JAVA que solicite ao usário um número inteiro n,
que deve ser positivo e maior que zero, e um caractere. Em seguida, terá que
preencher n linhas, cada uma delas com caracter lido aparecendo n vezes.
Exemplo: 
Número: 3; Caracter: *
Saída:
        ***
        ***
        ***
*/
package lista9;
import java.util.Scanner;
public class Exercicio12_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int qtd,i,j;
        char poo;
        
        System.out.print("Informe um número positivo: ");
        qtd = in.nextInt();
        if (qtd > 0){
            System.out.print("Informe um caracter: ");
            poo = in.next().charAt(0);
            for ( i = 1; i <= qtd; i++){
                System.out.print(poo);
                for (j = 1; j< qtd; j++){
                    System.out.print(poo);
                }
                System.out.println("");
            }
            
        }
        else
            System.out.println("Número deve ser maior que zero.");
        
        
    }
}
