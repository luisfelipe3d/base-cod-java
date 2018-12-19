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
public class Exercicio35_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [10];
        
        for (int i = 0; i < vetA.length; i++){
            //System.out.printf("Entre com número da posição A(%d):",i+1);
            vetA[i] = (int) (Math.random() * 10);
        }
        
        for (int i = 0; i < vetA.length; i++){
            System.out.println("Analizando o número: "+ vetA[i]);
            
            for (int j = 1; j < vetA[i]; j++){
                if (vetA[i] % j == 0)
                    System.out.println(j+" é divisor");
            }
            System.out.println("");
        }
    }
}
