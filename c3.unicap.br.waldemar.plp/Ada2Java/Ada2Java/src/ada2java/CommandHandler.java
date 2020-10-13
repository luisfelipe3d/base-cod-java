/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

import java.util.HashMap;
import java.util.Map;
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
    Map<String,String> varPlus = new HashMap<>();
    
    @Override
    public void addLine(String s) {
        s = s.trim();
        String[] split;

        if(s.contains("Put_Line")){
            split = s.split("[(]");
            int indexFim = s.lastIndexOf('"') + 1;
            int indexIni = s.indexOf('"');
            String msg = s.substring(indexIni, indexFim);
            System.out.println(msg);
            
        }
        

    }
    
}
