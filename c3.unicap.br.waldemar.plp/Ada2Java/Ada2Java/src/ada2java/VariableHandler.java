/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author joaot
 */
public class VariableHandler implements AdaHandler {

    private Map<String, Integer> varInt = new HashMap<>();
    private Map<String, Float> varFloat = new HashMap<>();
    private Map<String, Boolean> varBoolean = new HashMap<>();
    private Map<String, Character> varChar = new HashMap<>();
    
    private static VariableHandler uniqueInstance;
    
    private VariableHandler(){
        
    }
    
    public static synchronized VariableHandler getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new VariableHandler();
        }
        return uniqueInstance;
    } 
    
    @Override
    public void addLine(String s) {
        s = s.replaceAll(" ", "");
        if (s.endsWith(";")) {
            s = s.replace(";", "");
        }
        String[] split = s.split(":");
        if (split.length == 3) {
            split[2] = split[2].replaceAll("=", "");//remove qualquer caracter que n seja palavra
        }
        if (split.length >= 2 && split[1].startsWith("Integer")) {
            for (String str : split[0].split(",")) {
                if (split.length == 3) {
                    this.varInt.put(str, Integer.parseInt(split[2]));
                } else {
                    this.varInt.put(str, null);
                }
            }
        } else if (split.length >= 2 && split[1].startsWith("Float")) {
            for (String str : split[0].split(",")) {
                if (split.length == 3) {
                    this.varFloat.put(split[0], Float.parseFloat(split[2]));
                } else {
                    this.varFloat.put(split[0], null);
                }
            }
        } else if (split.length >= 2 && split[1].startsWith("Boolean")) {
            for (String str : split[0].split(",")) {
                if (split.length == 3) {
                    this.varBoolean.put(split[0], Boolean.parseBoolean(split[2]));
                } else {
                    this.varBoolean.put(split[0], Boolean.FALSE);
                }
            }
        } else if (split.length >= 2 && split[1].startsWith("Character")) {
            for (String str : split[0].split(",")) {
                if (split.length == 3) {
                    char aux = split[2].charAt(0);
                    this.varChar.put(split[0], aux);
                } else {
                    this.varChar.put(split[0], null);
                }
            }
        }

    }

    private void show(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println("Array[" + i + "]: " + s[i]);
        }
    }

    public int getInt(String x) {         
        if(this.varInt.containsKey(x)){
            Integer a = this.varInt.get(x);
            return a;
        }
        return -1;
    }

    public float getFloat(String z) {
        if(this.varFloat.containsKey(z)){
            Float a = this.varFloat.get(z);
            return a;
        }
        return -1;
    }

    public boolean showBoolean(String w) {
        if(this.varBoolean.containsKey(w)){
            Boolean b = this.varBoolean.get(w);
            return b;
        }
        return false;
    }

    public char getChar(String c) {
        Character v = this.varChar.get(c);
        if(this.varChar.containsKey(c)){ 
            return v;
        }
        return v;
    }
    
}
