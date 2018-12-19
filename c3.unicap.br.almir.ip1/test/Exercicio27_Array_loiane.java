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
public class Exercicio27_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [10];
        int[] vetB = new int [vetA.length];
        
        for (int i = 0; i<vetA.length; i++){
            //System.out.printf("Entre com número da posição A(%d):",i+1);
            vetA[i] = (int) (Math.random() * 20);
            
        }
        
        for (int i = 0; i<vetB.length; i++){
            if(vetA[i] < 7)
                vetB[i] = 'a';
            else if (vetA[i] == 7 )
                vetB[i] = 'b';
            else if (vetA[i] > 7 && vetA[i] < 10)
                vetB[i] = 'c';
            else if (vetA[i] == 10)
                vetB[i] = 'd';
            else
                vetB[i] = 'e';
        }
        
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.print("Vetor B: ");
        for (int i : vetB) {
            System.out.print((char)i+", ");
        }
        System.out.println("");
    }
}
