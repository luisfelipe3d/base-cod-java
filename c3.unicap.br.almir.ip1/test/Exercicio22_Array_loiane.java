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
public class Exercicio22_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [10];
        int qtd0 = 0, qtd1 = 0;
        
        for (int i = 0; i < vetA.length; i++){
            vetA[i] = (int)Math.round(Math.random() * 1);
            int aux = (vetA[i] == 0) ? qtd0++:qtd1++ ;  
        }
        // 10 - 100%
        // qtd0 - x
        // x = (qtd*100)/10;
        double porc0 = (qtd0*100)/10;
        double porc1 = 100 - porc0;
        String convertoBin = "";
        
        System.out.print("Vetor A = ");
        for (int i : vetA) {
            System.out.print(i+" ");
            convertoBin += i;
        }
        System.out.println("");
        
        
        System.out.println("Porc 0 = "+porc0);
        System.out.println("Porc 1 = "+porc1);
        binario(convertoBin);
    }
    
    static void binario(String x){
        int potencia = 0, decimal = 0;
        for (int i = x.length() - 1; i >= 0; i--){
            decimal += Math.pow(2, potencia) *
                    Character.getNumericValue(x.charAt(i));
            potencia++;
        }
        System.out.println("Binário: "+x);
        System.out.println("Decimal: "+decimal);
    }
}
