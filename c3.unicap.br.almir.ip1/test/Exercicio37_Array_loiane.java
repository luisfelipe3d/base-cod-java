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
public class Exercicio37_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        long[] vetA = new long [15];
        long[] vetB = new long [vetA.length];
        
        for (int i = 0; i < vetA.length; i++){
            System.out.printf("Entre com número da posição A(%d):",i+1);
            vetA[i] = in.nextInt();
        }
        
        for (int i = 0; i < vetA.length; i++){
            
            vetB[i] = 1;
            for (int j = 1; i <= vetA[i]; j++){
                vetB[i] *= j;
            }
        }
        
        System.out.print("Vetor A: ");
        for (long i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.print("Vetor B: ");
        for (long i : vetB) {
            System.out.print(i+", ");
        }
        System.out.println("");
    }
}
