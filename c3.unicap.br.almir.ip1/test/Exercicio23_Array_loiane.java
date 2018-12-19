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
public class Exercicio23_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [10];
        
        for (int i = 0; i < vetA.length; i++){
            System.out.print("Entre com um valor: ");
            vetA[i] = in.nextInt();
        }    
        
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            if (vetA[i] % 2 == 0)
                System.out.print(i+", ");
            else
                break;
        }
        
    }
}
