/*
Exercicio :
Faça um programa em JAVA para exibir os cubos dos números inteiros de 15 a 25.
 */
package lista8;

public class Exercicio4_lista8 {
    public static void main(String[] args) {
        long n=15;
        do {
            System.out.printf("N(%d): %d \n",n,(n*n*n));
            n++;
        } while (n<=25);
        
    }
}
