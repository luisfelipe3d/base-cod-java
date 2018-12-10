/*
Exercicio :
Faça um programa em java para gerar e imprimir os 25 primeiros termos da
seguinte série: 1,4,7,10,13,16,...
*/
package lista8;

public class Exercicio5_lista8 {
    public static void main(String[] args) {
        int n=1,cont=1;
        do {
            System.out.printf("Termo(%d): %d \n",cont,n);
            n = n + 3;
            cont++;
        } while (cont<=25);
    }
}
