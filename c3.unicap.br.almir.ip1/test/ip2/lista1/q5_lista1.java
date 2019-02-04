/*
Faça um programa para criar e preencher um vetor de 10 números inteiros.
O programa deve percorrer o vetor e determinar qual o maior e o menor elemento.
Para realizar suas tarefas, o programa deverá implementar os seguintes 
subprogramas:
(a) Procedimento para preencher o vetor. O procedimento deverá receber o vetor 
como parâmetro.
(b) Função para determinar o maior elemento do vetor. A função deverá receber 
o vetor como parâmetro e retornar o valor do maior elemento do vetor.
(c) Função para determinar o menor elemento do vetor. A função deverá receber
o vetor como parâmetro e retornar o índice do menor elemento do vetor.
 */
package ip2.lista1;
import java.util.Scanner;
/**
 *
 * @author luisfelipe3d
 */
public class q5_lista1 {
    public static void main(String[] args) {
        int[] vetA = new int [10];
        
        preencheVetor(vetA);
        showVetor(vetA);
        
        System.out.println("Maior valor: "+returnMaior(vetA));
        System.out.println("Index do menor valor: "+returnMenorIndex(vetA));
    }
    
    static void preencheVetor(int[] vetX){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < vetX.length; i++){
            //System.out.printf("Entre com o valor(%d): ",i+1);
            vetX[i] = (int) (Math.random() * 10);
        }
    }
    
    static void showVetor(int[] vetX){
        System.out.print("Vetor A = ");
        for (int i : vetX) {
            System.out.print(i+", ");
        }
        System.out.println("");
    }
    
    static int returnMaior(int[] vetX){
        int maior = 0;
        for (int i : vetX) {
            if (vetX[i] > maior)
                maior = vetX[i];
        }
        return maior;
    }
    
    static int returnMenorIndex(int[] vetY){
        int menor = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < vetY.length; i++){
            if (vetY[i] < menor){
                menor = vetY[i];
                index = i;
            }
        }
        return index;
    }
    
}
