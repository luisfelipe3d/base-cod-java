/*
lista 1
8ª  Questão: Faça um programa para criar e preencher um vetor de 10 números inteiros.  
O programa deve percorrer o vetor e determinar qual o maior e o menor elemento.
 */
package lista1;

public class lista1_q8 {
    public static void main(String[] args) {
        int []vet = new int [10];
        int maior= Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int)(Math.random() * 10);
            if (vet[i] < menor){
                menor = vet[i];
            }else if (vet[i] > maior){
                maior = vet[i];
            }
        }
        showVetores(vet);
        System.out.println("Menor valor: "+menor);
        System.out.println("Maior valor: "+maior);
    }
    public static void showVetores(int[] v){
        System.out.print("vetR: {");
        for (int i = 0; i < v.length; i++) {
            System.out.print(", "+v[i]);
        }
        System.out.println("}");
    }
}
