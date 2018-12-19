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
public class Exercicio31_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [20];
        int[] vetB = new int [vetA.length];
        int posB = 0;
        for (int i = 0; i < vetA.length; i++){
            //System.out.printf("Entre com número da posição A(%d):",i+1);
            vetA[i] = (int) (Math.random() * 20);

        }
        //pares
        for (int i = 0; i < vetA.length; i++){
            if (vetA[i] % 2 == 0){
                vetB[posB] = vetA[i];
                posB++;
            }
        }
        //impares
        for (int i = 0; i < vetA.length; i++){
            if (vetA[i] % 2 != 0){
                vetB[posB] = vetA[i];
                posB++;
            }
        }
        
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.print("Vetor B: ");
        for (int i = 0; i < posB; i++){
            System.out.print(vetB[i]+", ");
        }
        System.out.println("");
    }
}
