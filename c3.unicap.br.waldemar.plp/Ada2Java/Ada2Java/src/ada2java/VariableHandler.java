/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joaot
 */
public class VariableHandler implements AdaHandler{
    
    Map<String, String> varString = new HashMap<String, String>();
    Map<String, Integer> varInt = new HashMap<String, Integer>();

    @Override
    public void addLine(String s) {
        s = s.replaceAll(" ", "");
        String[] split = s.split(":");
        if(split[1].startsWith("String")){
            if(split[2] != null){
                split[2] = split[2].replaceAll("=", "");
                varString.put(split[0], split[2]);
            }
            else
                varString.put(split[0], "");
        }
        if(split[1].startsWith("Integer")){
            if(split[2] != null){
                split[2] = split[2].replaceAll("=", "");
                varInt.put(split[0], Integer.parseInt(split[2]));
            }
            else
                varString.put(split[0], "");
        }
    }
    
}
