/*
Exercicio :
3. Faça um programa em JAVA para exibir todos os números inteiros e menores
que 500 que quando divisível por 9 deixam resto 4.
*/
package lista8;

public class Exercicio3_lista8 {
    public static void main(String[] args) {
        int n=0;
        
        do {
            if (n%9 == 4)
                System.out.println(n+", ");
            n++;
        } while (n <= 500);
    }
}
