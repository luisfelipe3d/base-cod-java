
import java.util.Scanner;

public class Exercicio8_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [10];
        int[] vetB = new int [vetA.length];
        int[] vetC = new int [vetA.length];
        
        for(int i = 0; i<vetA.length; i++){
            System.out.printf("Entre com o valor da posição(%d): ",i+1);
            vetA[i] = in.nextInt();
            System.out.printf("Entre com o valor da posição(%d): ",i+1);
            vetB[i] = in.nextInt();
            vetC[i] = vetA[i] * vetB[i];
        }
        //Mostra resultado vetor A
        System.out.print("Vetor A:");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        //Mostra resultado vetor B
        System.out.print("Vetor B:");
        for (int i : vetB) {
            System.out.print(i+", ");
        }
        System.out.println("");
        //Mostra multiplicação do vetA + vetB
        System.out.print("Subtração vetA e vetB = ");
        for (int i : vetC) {
            System.out.print(i+", ");
        }
        System.out.println("");
    }
}
