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
        String[] split = s.split("(");
        split[1] = split[1].replaceAll(")", "");
        split[1] = split[1].replaceAll(";", "");
        
        if(split[0].startsWith("Put_Line")){
            System.out.println(split[1]);
        } else if(split[0].startsWith("Get")){
            Scanner in = new Scanner(System.in);
            //colocar o valor do scanner na variavel passada no get;
        } else if(split[0].startsWith("Put")){
            //
        } //falta ler o if e for
    }
    
}
