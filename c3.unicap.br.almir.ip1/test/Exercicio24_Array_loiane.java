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
public class Exercicio24_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int[10];
        
        for (int i = 0; i < vetA.length; i++){
            System.out.printf("Entre com número(%d): ",i+1);
            vetA[i] = in.nextInt();
        }
        
        //1221
        // i = 1 ; 1 == 1
        // i = 2 ; 2 == 2
        //Não precisa ir até o final do vetor. Apenas metade
        boolean palindromo = true;
        for (int i = 0; i < (vetA.length/2); i++){
            
            if (vetA[i] != vetA[vetA.length - 1 - i]){
                palindromo = false;
                break;
            }  
        }
        
        if(palindromo)
            System.out.println("Palindromo");
        else
            System.out.println("Não é Palindromo");
        
    }
}
