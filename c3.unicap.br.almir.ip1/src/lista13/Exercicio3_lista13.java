/*
Exercicio:
Faça um programa que tem uma função que receba um caractere e retorne 1, caso 
este seja letra e 0, caso não seja. O programa principal deve se encarregar de 
informar ao usuário a resposta. 
Exemplo: Entrada (Caractere digitado pelo usuário): ~ Saída: ~ não é uma letra. 
Obs.: Toda entrada e saída de dados deve ser feita no programa principal (main)
*/
package lista13;
import java.util.Scanner;

public class Exercicio3_lista13 {
    
    static boolean ehcaracter(char c){
        c = Character.toLowerCase(c);
        return c >= 'a' && c <= 'z';
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        char caracter;
        System.out.print("Digite caracter: ");
        caracter = in.next().charAt(0);
        if (ehcaracter(caracter))
            System.out.println(caracter+" é uma letra");
        else
            System.out.println(caracter+" não é uma letra");
    }
}
