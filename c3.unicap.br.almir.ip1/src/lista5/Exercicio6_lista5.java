/*
Exercicio :
Dado um ano d.C. (depois de Cristo), identifique
se este é um ano bissexto ou não. Considere que para
o ano ser bissexto basta que ele seja divisível por 400.
Caso contrário, este precisará ser divisível por 4 e não
ser divisível por 100.
 */
package lista5;
import java.util.Scanner;

public class Exercicio6_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano;
        
        //Recebe o ano
        System.out.print("Digite um ano: ");
        ano = in.nextInt();
        
        //verifica se é bissexto
        if ((ano%4 == 0 && ano%100 != 0) || ano%400 == 0) 
            System.out.println("Ano é bissexto");
         else 
            System.out.println("Ano não é bissexto");
    }
}
