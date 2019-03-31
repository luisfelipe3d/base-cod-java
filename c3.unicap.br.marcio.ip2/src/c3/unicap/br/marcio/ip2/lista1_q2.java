/*
Lista 1
2ª Questão: Faça um programa para criar dois vetores de 10 números inteiros, 
A e B. O programa deve preencher o vetor A com valores digitados pelo usuário. 
O vetor B deve ser preenchido da seguinte forma:os elementos de índice par são 
os correspondentes de A divididos por 2 e os elementos de índice ímpar são os 
correspondentes de A multiplicados por 3.Aofinal, o programa deverá exibir 
os dois vetores (A e B).
 */
package c3.unicap.br.marcio.ip2;
import java.util.Scanner;
public class lista1_q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []vetA,vetB;
        vetA = new int[10];
        vetB = new int[vetA.length];
        int entrada;
        
        for(int i = 0; i < vetA.length; i++){
            System.out.print("Digite valor: ");
            vetA[i] = in.nextInt();
            if(i % 2 == 0){
                vetB[i] = vetA[i]/2;
            } else{
                vetB[i] = vetA[i]*3;
            }
        }
        showVetores(vetA, vetB);
        
    }
    
    public static void showVetores(int v[], int c[]){
        System.out.print("VetA: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+", ");
        }
        System.out.println("}");
        
        System.out.print("VetB: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+", ");            
        }
        System.out.println("}");
    }
}
