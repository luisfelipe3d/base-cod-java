/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Exercicio1_Array_loaine {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Random rdm = new Random();
        int[] vetA = new int [5];
        int[] vetB = new int [vetA.length];

        
        for (int i = 0; i < vetA.length; i++){
            vetA[i] = rdm.nextInt();
            vetB[i] = vetA[i];
        }
        
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.print("Vetor B: ");
        for (int i : vetB) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        for (int j = 0; j < vetA.length; j++){
            System.out.print("Entre com valor da posição: ");
            vetA[j] = in.nextInt();
            vetB[j] = vetA[j];
        }
        
        System.out.print("VetA: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.print("VetB: ");
        for (int i : vetB) {
            System.out.print(i+", ");
        }
        System.out.println("");
    }
}
