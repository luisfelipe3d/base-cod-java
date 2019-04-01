/*
lista 1
5ª Questão: Altere o programa  da questão anterior para exibir as somas parciais 
a cada 10 elementos lidos.
 */
package lista1;
import java.util.Scanner;
public class lista1_q5 {
    public static void main(String[] args) {
        double []vetR;
        vetR = new double[100];
        double soma=0;
        int aux=10;
        for (int i = 0; i < vetR.length; i++) {
            vetR[i] = (Math.random() * 10);
            soma = soma + vetR[i];
            if((i+1) % 10 == 0){
                showVetores(vetR);
                System.out.printf("Somatório[%d]: %.2f\n",(i+1),soma);
                soma = 0;
            }
        }
    }
    
    public static void showVetores(double[] v){
        System.out.print("vetR: {");
        for (int i = 0; i < v.length; i++) {
            System.out.printf(", %.2f",v[i]);
        }
        System.out.println("}");
    }
}
