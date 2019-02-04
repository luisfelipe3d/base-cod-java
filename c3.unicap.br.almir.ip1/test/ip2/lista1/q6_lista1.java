/*
Faça um programa para criar e preencher um vetor de 10 números reais. 
O programa deve percorrer o vetor e determinar qual a maior diferença, 
em termos absolutos, entre dois elementos consecutivos.
(a) Procedimento para preencher o vetor. O procedimento deverá receber o 
vetor como parâmetro.
(b) Função para determinar a maior diferença, em termos absolutos, entre 
dois elementos consecutivos do vetor. A função deverá receber o vetor como 
parâmetro e retornar a maior diferença.
 */
package ip2.lista1;
import java.util.Scanner;
/**
 *
 * @author luisfelipe3d
 */
public class q6_lista1 {
    public static void main(String[] args) {
        double[] vetA = new double[10];
        
        preencheVetor(vetA);
        showVetor(vetA);
        System.out.printf("Maior valor absoluto: %.4f \n",absoluto(vetA));
    }
    
    static void preencheVetor(double[] vetX){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < vetX.length; i++){
            //System.out.printf("Entre com o valor(%d): ",i+1);
            vetX[i] = Math.random() * 10;
        }
    }
    
    static double absoluto(double[] vetY){
        double resultado = 0;
        double maxDiff = 0;

        for (int i = 0; i < vetY.length; i++){
            
            for (int j = 1; j < vetY.length; j++){
                
                resultado = Math.abs(vetY[i] - vetY[j]);
                if (resultado > maxDiff)
                    maxDiff = resultado;
            }
        }
        
        return maxDiff;
    }
    
    static void showVetor(double[] vetX){
        System.out.print("Vetor A = ");
        for (double i : vetX) {
            System.out.printf("%.2f, ",i);
        }
        System.out.println("");
    }
}
