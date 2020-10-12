/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

import java.util.Scanner;

/**
 *
 * @author joaot
 */
public class CommandHandler implements AdaHandler{

    //Put_Line("Digite seu nome: ");
    //Put (N);
    
    
    @Override
    public void addLine(String s) {
        String[] split;
        if(s.contains("Put_Line")){
            split = s.split("\"");
            System.out.println("aqui");
            for(String a: split){
                System.out.print(a);
            }
            System.out.println(s.length());
        }

    }
    
}
