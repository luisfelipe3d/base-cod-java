/*
Exercicio :
Fornecidos o ano de nascimento de uma pessoa e o ano atual, calcule
e mostre a idade da pessoa e quantos anos essa pessoa tinha/terá em 2015.
 */
package lista3;
import java.util.Scanner;

public class Exercicio7_lista3 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        int ano_nasc,ano_atual,idade,aux;
        
        //Entrada
        System.out.print("Digite o ano de nascimento: ");
        ano_nasc = in.nextInt();
        System.out.print("Digite o ano atual: ");
        ano_atual = in.nextInt();
        
        //Processamento
        idade = ano_atual - ano_nasc;
        aux = idade - (ano_atual-2015);
        
        //Saida
        System.out.println("Sua idade é: "+idade);
        System.out.println(" No ano de 2015, sua idade era de: "+aux);
    }
}
