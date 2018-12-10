/*
Exercicio :
Faça um programa em JAVA para exibir todos os números inteiros positivos
disivíveis por 7 e menores que 100. Para verificar se o número é divisível
por 7, o programa deverá checar se o resto da divisão do número por 7 é
igual a zero.
 */
package lista8;

public class Exercicio2_lista8 {
    public static void main(String[] args) {
        int n=0;
        do {
            if (n%7 == 0)
                System.out.printf("O número: %d é divisível por 7.\n",n);
            n++;
        } while (n<101);
    }
}
