/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Exercicio9_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [10];
        int[] vetB = new int [vetA.length];
        double[] vetC = new double [vetA.length];
        
        for(int i = 0; i<vetA.length; i++){
            System.out.printf("Entre com o valor da posição(%d): ",i+1);
            vetA[i] = in.nextInt();
            System.out.printf("Entre com o valor da posição(%d): ",i+1);
            vetB[i] = in.nextInt();
            vetC[i] = vetA[i] / vetB[i];
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
        //Mostra divisão do vetA + vetB
        System.out.print("Divisão vetA e vetB = ");
        for (double i : vetC) {
            System.out.print(i+", ");
        }
        System.out.println("");
    }
}
