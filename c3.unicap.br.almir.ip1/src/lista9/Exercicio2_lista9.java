/*
Exercicio :
Faça um programa em JAVA para exibir todos os números inteiros 
divisíveis por 4, maiores ou iguais a 100 e menores ou iguais a 400. 
 */
package lista9;

public class Exercicio2_lista9 {
    public static void main(String[] args) {
        int i;
        for(i = 100; i<= 400; i++){
            if (i%4 == 0)
                System.out.println(i);
        }
    }
}
