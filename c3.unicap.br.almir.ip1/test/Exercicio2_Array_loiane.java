/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;

public class Exercicio2_Array_loiane {
    public static void main(String[] args) {
        Random rdm = new Random();
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [8];
        int[] vetB = new int [vetA.length];
        
        for (int j = 0; j < vetA.length; j++){
            System.out.print("Entre com valor da posição: ");
            vetA[j] = in.nextInt();
            vetB[j] = vetA[j] * 2;
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
    

