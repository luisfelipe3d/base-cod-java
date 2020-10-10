/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java.handler;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author home
 */
public class VariableHandler implements TiposPrimitivos {

    Map<String, Integer> variaveisInt = new HashMap<String,Integer>();

    @Override
    public void addLine(String line) {
        line = line.trim();
        String[] parts = line.split(":");
        if(parts[1].startsWith("Integer")){
           for(String varName: parts[0].split(",")){
               variaveisInt.put(varName, 0);
           } 
        }
        
    }


    
}
