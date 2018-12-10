/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loaine_training;

import java.util.Scanner;

public class Exercicio10_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o turno: ");
        String turno = in.next();
        
        if (turno.equalsIgnoreCase("m"))
            System.out.println("Bom dia.");
        else if (turno.equalsIgnoreCase("v"))
            System.out.println("Boa tarde.");
        else if (turno.equalsIgnoreCase("n"))
            System.out.println("Boa noite.");
        else
            System.out.println("Valor inválido");
        
        
    }
}
