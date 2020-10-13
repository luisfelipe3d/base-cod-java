/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author joaot
 */
public class CommandHandler implements AdaHandler{

    //Put_Line("Digite seu nome: ");
    //Put (N);
    Stack<String> varStack = new Stack<>();
    
    @Override
    public void addLine(String s) {
        String[] split;
        s = s.trim();
        if(s.contains("Put_Line")){
            split = s.split("[(]");

            int indexFim = s.lastIndexOf('"') + 1;
            int indexIni = s.indexOf('"');
            String msg = s.substring(indexIni, indexFim);
            System.out.println(msg);
        }

    }
    
}
