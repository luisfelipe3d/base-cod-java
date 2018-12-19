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
public class Exercicio36_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double[] vetA = new double [11];
        
        for (int i = 0; i < vetA.length; i++){
            //System.out.printf("Entre com número da posição A(%d):",i+1);
            vetA[i] = (int) (Math.random() * 10);
        }
        
        System.out.print("Vetor A: ");
        for (double d : vetA) {
            System.out.print(d+", ");
        }
        System.out.println("");
        
        System.out.print("Resultado: ");
        for (double d : vetA) {
            System.out.print(Math.pow(2,d)+", ");
        }
        System.out.println("");
    }
}
