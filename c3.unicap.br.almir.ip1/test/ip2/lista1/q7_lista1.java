/*
Tentando descobrir se um dado era viciado, um dono de cassino o lançou 
1.000.000 vezes. Dados os 1.000.000 de resultados dos lançamentos, determinar
o número de ocorrências de cada face. Utilize uma função de geração de números 
aleatórios para simular o lançamento do dado.
 */
package ip2.lista1;
import java.util.Scanner;

public class q7_lista1 {
    public static void main(String[] args) {
        int[] vetA = new int[1000000];
        preencheVetor(vetA);
    }
    
    static void preencheVetor(int[] vetX){
        Scanner in = new Scanner (System.in);
        int face1 = 0, face2 = 0, face3 = 0, face4 = 0, face5 = 0, face6 = 0;
        
        for (int i = 0; i < vetX.length; i++){
            //System.out.printf("Entre com o valor(%d): ",i+1);
            vetX[i] =(int) (Math.random() * ((6 - 1) + 1) + 1);
            if (vetX[i] == 1)
                face1++;
            else if (vetX[i] == 2)
                face2++;
            else if (vetX[i] == 3)
                face3++;
            else if (vetX[i] == 4)
                face4++;
            else if (vetX[i] == 5)
                face5++;
            else
                face6++;
        }
        System.out.println("Face1: "+face1);
        System.out.println("Face2: "+face2);
        System.out.println("Face3: "+face3);
        System.out.println("Face4: "+face4);
        System.out.println("Face5: "+face5);
        System.out.println("Face6: "+face6);
    }
}
