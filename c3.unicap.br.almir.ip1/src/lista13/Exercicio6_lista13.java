/*
Exercicio:
Dada a seqüência ( 2, 3, 4, 9, 16, 29, 54, 99, ... ) onde cada elemento, a 
partir do quarto, é a soma dos três termos que lhe antecedem, faça um programa 
que contenha um procedimento. Este deve receber três termos, inteiros, iniciais
quaisquer para calcular e exibir os 20 termos seguintes.
Obs.: Toda entrada de dados deve ser feita no programa principal. 
 */
package lista13;
import java.util.Scanner;

public class Exercicio6_lista13 {
    
    static void sequencia(int n1, int n2, int n3){
        int soma;
        
        System.out.printf("Sequencia: %d, %d, %d, ",n1,n2,n3);
        
        for (int i = 4; i<= 20; i++){
            soma = n1 + n2 + n3;
            System.out.print(soma+", ");
            n1 = n2;
            n2 = n3;
            n3 = soma;
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1,num2,num3;
        
        System.out.print("Num: ");
        num1 = in.nextInt();
        System.out.print("Num: ");
        num2 = in.nextInt();
        System.out.print("Num: ");
        num3 = in.nextInt();
        
        sequencia(num1,num2,num3);
        
    }
}
