
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public class BreakEcontinue {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x,y;
        
        System.out.print("Num inicial: ");
        x = in.nextInt();
        System.out.print("Num final: ");
        y = in.nextInt();
        //Break ; quando o if for true ele para
        for (int i = x; i <= y; i++){
            System.out.println(i);
            if (i % 7 == 0){
                System.out.println("O número de i é: "+i);
                break;
            }
        }
        
        System.out.println("");
        // continue ; ele pula a execução do código do if 
        for (int j = x; j<= y; j++){
            if (j % 2 == 0)
                continue;
            System.out.println("Valor de J: "+j);
        }
        
        
        System.out.println("Fim ");
    }
}

