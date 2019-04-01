/*
Lista 1
4ª Questão: Faça um programa para criar um vetor VET de 100 números reais.
O vetor VET deve ser preenchido com valores informados pelo usuário. 
O programa deve calcular e exibira soma dos elementos do vetor.
 */
package lista1;
import java.util.Scanner;

public class lista1_q4 {
    public static void main(String[] args) {
        double []vetR;
        vetR = new double[100];
        double soma=0;
        
        for (int i = 0; i < vetR.length; i++) {
            vetR[i] = (Math.random() * 100);
            soma = soma + vetR[i];
        }
        showVetores(vetR);
        System.out.printf("Somatório: %.2f\n",soma);
    }
    
    public static void showVetores(double[] v){
        System.out.print("vetR: {");
        for (int i = 0; i < v.length; i++) {
            System.out.printf(", %.2f",v[i]);
        }
        System.out.println("}");
    }
}
