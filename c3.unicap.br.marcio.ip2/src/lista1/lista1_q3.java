/*
lista 1
3ª Questão: Faça um programa para criar três vetores de 5 números inteiros, A, B e C.
Os vetores A e B devem ser preenchidos com valores digitados pelo usuário. 
O programa deve calcular a soma dos vetores A e B e armazenar o resultado no vetor C. 
Ao final,  o programa  deverá exibir  o conteúdo do vetor C.
 */
package lista1;
import java.util.Scanner;

public class lista1_q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] vetA,vetB,vetC;
        vetA = new int[5];
        vetB = new int[vetA.length];
        vetC = new int[vetB.length];
        int entrada;
        
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite valor: ");
            vetA[i] = in.nextInt();
            
            System.out.print("Digite valor: ");
            vetB[i] = in.nextInt();
            
            vetC[i] = vetA[i] + vetB[i];
        }
        showVetores(vetA, vetB, vetC);     
    }
    public static void showVetores(int []a, int []b, int[]c){
        System.out.print("VetA: {");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println("}");
        
        System.out.print("VetB: {");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+", ");            
        }
        System.out.println("}");
        
        System.out.print("VetC: {");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+", ");            
        }
        System.out.println("}");
    }
}
