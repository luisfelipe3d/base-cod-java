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
public class Exercicio17_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] idades = new int [10];
        
        
        for(int i = 0; i<idades.length; i++){
            System.out.print("Informe idade: ");
            idades[i] = in.nextInt();            
        }
        
        int qtdIdade=0;
        for (int i = 0; i<idades.length; i++){
            if (idades[i] > 35)
                qtdIdade++;
        }
        
        System.out.print("Vetor idades: ");
        for (int i : idades) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.println("QTD > 35: "+qtdIdade);
    }
}
