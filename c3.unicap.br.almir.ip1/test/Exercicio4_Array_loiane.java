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
public class Exercicio4_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int []vetA = new int[15];
        double []vetB = new double[vetA.length];
        
        for(int i = 0 ; i < vetA.length; i++){
            System.out.printf("Entre com o valor posição(%d): ",i+1);
            vetA[i] = in.nextInt();
            vetB[i] = Math.sqrt(vetA[i]);
        }
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.print("vetor B: ");
        for (double i : vetB) {
            System.out.printf("%.2f, ",i);
        }
        System.out.println("");
    }
}
