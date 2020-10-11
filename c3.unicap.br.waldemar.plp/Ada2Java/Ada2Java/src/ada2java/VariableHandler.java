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
    Map<String, Float> varFloat = new HashMap<String, Float>();
    Map<String, Boolean> varBoolean = new HashMap<String, Boolean>();
    Map<String, Character> varChar = new HashMap<String, Character>();

    @Override
    public void addLine(String s) {
        s = s.replaceAll(" ", "");
        String[] split = s.split(":");
        
        if (split[2] != null)
            split[2] = split[2].replaceAll("=", "");
        
        if(split[1].startsWith("String")){
            if(split[2] != null){
                varString.put(split[0], split[2]);
            }
            else
                varString.put(split[0], "");
        }
        if(split[1].startsWith("Integer")){
            if(split[2] != null){
                varInt.put(split[0], Integer.parseInt(split[2]));
            }
            else
                varInt.put(split[0], 0);
        }
        if(split[1].startsWith("float")){
            if(split[2] != null){
                varFloat.put(split[0], Float.parseFloat(split[2]));
            }
            else
                varFloat.put(split[0], 0.0f);
        }
        if(split[1].startsWith("Boolean")){
            if(split[2] != null){
                varBoolean.put(split[0], Boolean.parseBoolean(split[2]));
            }
            else
                varBoolean.put(split[0], false);
        }
        if(split[1].startsWith("Boolean")){
            if(split[2] != null){
                varBoolean.put(split[0], Boolean.parseBoolean(split[2]));
            }
            else
                varBoolean.put(split[0], false);
        }
    }
    
}
