/*
Exercicio:
Sabe-se que o produto de dois números a e b inteiros pode ser obtido através 
de sucessivas multiplicações (por 2),divisões (por 2) e somas. Enquanto o 
primeiro número (a) é dividido por 2, o segundo número (b) é multiplicado por 2.
Quando o resultado da divisão do primeiro número (a) por 2 for ímpar, o 
resultado da multiplicação do segundo número (b) por 2, correspondente, é 
acumulado; caso contrário deve-se passar para a próxima multiplicação e divisão. 
Quando o resultado da divisão do primeiro número (a) por 2 for 0 (zero), o valor  
acumulado corresponderá ao resultado final (a x b). 

Obs:Se no início, o primeiro número (a) já for ímpar, o segundo número (b) já 
deve ser acumulado. 

Faça uma função que receba como parâmetro os dois números (a e b) a serem 
multiplicados e retorne o resultado da multiplicação (a x b) entre eles usando 
a especificação acima. 
Exemplo: 

 */
package lista12;

import java.util.Scanner;

public class Exercicio7_lista12 {

    static int multiplicacoes(int n1, int n2) {
        int va  = 0;

        do {
            if (n1 % 2 != 0) {
                va  = va  + n2;
            }
            n1 = n1 / 2;
            n2 = n2 * 2;
        } while (n1 > 0);
        return va;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int val1, val2;
        System.out.println("Nº 1: ");
        val1 = in.nextInt();
        System.out.println("Nº 2: ");
        val2 = in.nextInt();
        System.out.println("Resultado: " + multiplicacoes(val1, val2));
    }
}
