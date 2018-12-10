/*
Exercicio :
Altere o programa anterior de forma que, em vez de asteriscos, sejam
escritos letras em cada nível, começando com a letra 'A'
EX: com 3,4 e 5 ramos:
A           A       A
BB          BB      BB
CCC         CCC     CCC
            DDDD    DDDD
                    EEEEE
 */
package lista7;
import java.util.Scanner;

public class Exercicio8_lista7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n,i = 1,j = 1;
        char caracter = 'A';
        
        System.out.print("Digite o número de ramos: ");
        n = in.nextInt();
        
        while(i<=n){
            while(j<=i){
                System.out.print(caracter);
                j++;
            }
            System.out.println();
            i++;
            caracter++;
            j = 1;
        }
        
    }
}
