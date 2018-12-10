/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loaine_training;
import java.util.Scanner;

public class Exercicio8_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double preco1,preco2,preco3;
        
        System.out.println("Preço1: ");
        preco1 = in.nextDouble();
        
        System.out.println("Preço2: ");
        preco2 = in.nextDouble();
        
        System.out.println("Preço3: ");
        preco3 = in.nextDouble();
        
        if (preco1 <= preco2 && preco1 <= preco3)
            System.out.println("Compre produto1.");
        else if(preco2 <= preco3)
            System.out.println("Compre produto2.");
        else
            System.out.println("Compre produto3.");
    }
}