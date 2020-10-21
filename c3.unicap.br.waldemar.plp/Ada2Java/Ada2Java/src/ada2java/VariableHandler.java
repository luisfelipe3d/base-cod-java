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
public class VariableHandler implements AdaHandler {

    private Map<String, Integer> varInt = new HashMap<>();
    private Map<String, Float> varFloat = new HashMap<>();
    private Map<String, Boolean> varBoolean = new HashMap<>();
    private Map<String, Character> varChar = new HashMap<>();

    private static VariableHandler uniqueInstance;

    private VariableHandler() {

    }

    public static synchronized VariableHandler getInstance() {
        if (uniqueInstance == null) {
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
        String op = split[1];
        switch (op) {
            case "Integer":
                for (String str : split[0].split(",")) {
                    if (split.length == 3){
                        if(getInt(split[2])!= null){
                            this.varInt.put(str, getInt(split[2]));
                        } else {
                            this.varInt.put(str, Integer.parseInt(split[2]));
                        }
                    } else {
                        this.varInt.put(str, null);
                    }
                }
                break;
            case "float":
                for (String str : split[0].split(",")) {
                    if (split.length == 3) {
                        if(getFloat(split[2])!= null){
                            this.varFloat.put(str, getFloat(split[2]));
                        } else{
                            this.varFloat.put(split[0], Float.parseFloat(split[2]));
                        }
                    } else {
                        this.varFloat.put(split[0], null);
                    }
                }
                break;
            case "Boolean":
                for (String str : split[0].split(",")) {
                    if (split.length == 3) {
                        if(getBoolean(split[2]) != null){
                            this.varBoolean.put(str, getBoolean(split[2]));//inic com refere a outra var ex: A: Boolean := C;
                        } else {
                            this.varBoolean.put(str, Boolean.FALSE);//inic sem refere a outra var ex: A: Boolean := false;
                        }
                    } else {
                        this.varBoolean.put(split[0], Boolean.FALSE); //inic sem valor ex: A: Boolean;
                    }
                }
                break;
            case "Character":
                for (String str : split[0].split(",")) {
                    if (split.length == 3) {
                        if(getCharacter(split[2])!=null){
                            this.varChar.put(str, getCharacter(split[2]));
                        } else{
                            this.varChar.put(str, split[2].charAt(0));
                        }
                    } else {
                        this.varChar.put(split[0], null);
                    }
                }
                break;
        }
        showMap();
    }

    private void show(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println("Array[" + i + "]: " + s[i]);
        }
    }
    
    private void showMap(){
        this.varInt.forEach((key, value) -> System.out.println(key + ":" + value));
    }
    


    public Integer getInt(String x) {
        if (this.varInt.containsKey(x)) {
            Integer a = this.varInt.get(x);
            return a;
        }
        return null;
    }

    public Float getFloat(String z) {
        if (this.varFloat.containsKey(z)) {
            Float a = this.varFloat.get(z);
            return a;
        }
        return null;
    }

    public Boolean getBoolean(String w) {
        if (this.varBoolean.containsKey(w)) {
            Boolean b = this.varBoolean.get(w);
            return b;
        }
        return null;
    }

    public Character getCharacter(String c) {
        Character v = this.varChar.get(c);
        if (this.varChar.containsKey(c)) {
            return v;
        }
        return null;
    }
    
    public void setInt(String chave, Integer valor){
        this.varInt.replace(chave, valor);
    }
    
    public void setFloat(String chave, Float valor){
        this.varFloat.replace(chave, valor);
    }

    public void getPlus(String p) {

    }

    public void getMinus(String p) {

    }

    public void getMult(String p) {

    }

    public void getDiv(String p) {

    }
}
