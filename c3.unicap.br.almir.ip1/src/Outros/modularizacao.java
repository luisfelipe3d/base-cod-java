/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;


public class modularizacao {
    public static void main(String[] args) {
        linha();
        System.out.println("Números entre 1 e 5: ");
        linha();
        
        for (int i = 1; i <=5; i++)
            System.out.println("*    "+i+"   *");
        linha();
    }
    
    static void linha (){
        for (int i = 1; i<= 10; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
