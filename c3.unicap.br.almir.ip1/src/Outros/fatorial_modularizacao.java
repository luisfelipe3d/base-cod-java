/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class fatorial_modularizacao {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x,y;
        
        System.out.println("Digite fat: ");
        x = in.nextInt();
        y = in.nextInt();
        
        System.out.println("Resul: "+(fat(x)));
        System.out.println("Resul: "+(fat(y)));
        System.out.println("Resultado: "+(fat(x)+fat(y)));
    }
    
    static int fat(int n){
        int f = 1;
        for (int i = 1 ; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    
    
}
