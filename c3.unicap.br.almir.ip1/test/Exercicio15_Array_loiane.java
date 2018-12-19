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
public class Exercicio15_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int[10];
        int par=0;
        int impar = vetA.length - par;
        
        for (int i = 0; i <vetA.length; i++){
            System.out.print("Entre com o valor: ");
            vetA[i] = in.nextInt();
            if (vetA[i] % 2 == 0)
                par++;   
        }
        // vetA.length - 100
        // par  - x
        // = x* vetA.length == impar * 100
        // x = impar*100 / vetA.length
        double porcPar  = (par*100) / vetA.length;
        double porcImpar = 100 - porcPar;
        
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.println("Porcentagem Pares: "+porcImpar);
        System.out.println("Porcentagem Impares: "+porcPar);

    }
    
}
