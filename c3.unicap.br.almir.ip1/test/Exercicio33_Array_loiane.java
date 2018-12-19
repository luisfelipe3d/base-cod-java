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
public class Exercicio33_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [5];
        
        for (int i = 0; i < vetA.length; i++){
            //System.out.printf("Entre com número da posição A(%d):",i+1);
            vetA[i] = (int) (Math.random() * 20);
        }
        
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        boolean primo = true;
        String msg = "";

        for (int i : vetA) {
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    primo = false;
                    break;
                }
            }
            
            if (primo)
                msg = "primo";
            else
                msg = "não é primo";
            
            System.out.println(i+", "+msg);
        }
    }
}
