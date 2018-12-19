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
public class Exercicio20_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double[] vetA = new double [20];
        double cotacao;
        
        System.out.print("Entre com a cotação do dólar: ");
        cotacao = in.nextDouble();
        
        for (int i = 0; i<vetA.length; i++){
            vetA[i] = cotacao * (i+1);
        }
        
        System.out.print("Vetor 2 = ");
        for(int i = 0; i<vetA.length; i++){
            System.out.printf("%.2f",vetA[i]);
            System.out.print(", ");
        }
        System.out.println("");
    }
}
