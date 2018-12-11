/*
Faca um program em JAVA que recaba um valor inteiro, calcule e mostre sua 
tabuada.
 */
package prova1GQ;
import java.util.Scanner;

public class questao2_prova1gq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Digite o valor número: ");
        num = in.nextInt();
        System.out.println("Tabuda de : "+num);
        for (int i = 1; i <=10 ; i++ ){
            System.out.println(i+" X "+num+ " = "+ (num*i));
        }
        
    }
}
