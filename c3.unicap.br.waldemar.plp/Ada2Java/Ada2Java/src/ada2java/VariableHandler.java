/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author joaot
 */
public class VariableHandler implements AdaHandler {

    //Map<String, String> varString = new HashMap<>();
    Map<String, Integer> varInt = new HashMap<>();
    Map<String, Float> varFloat = new HashMap<>();
    Map<String, Boolean> varBoolean = new HashMap<>();
    Map<String, Character> varChar = new HashMap<>();

    @Override
    public void addLine(String s) {
        s = s.replaceAll(" ", "");
        if (s.endsWith(";")) {
            s = s.replace(";", "");
        }
        String[] split = s.split(":");
        show(split);
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
            showInt();
        } else if (split.length >= 2 && split[1].startsWith("Float")) {
            for (String str : split[0].split(",")) {
                if (split.length == 3) {
                    this.varFloat.put(split[0], Float.parseFloat(split[2]));
                } else {
                    this.varFloat.put(split[0], null);
                }
            }
            showFloat();
        } else if (split.length >= 2 && split[1].startsWith("Boolean")) {
            for (String str : split[0].split(",")) {
                if (split.length == 3) {
                    this.varBoolean.put(split[0], Boolean.parseBoolean(split[2]));
                } else {
                    this.varBoolean.put(split[0], Boolean.FALSE);
                }
            }
            showBoolean();
        } else if (split.length >= 2 && split[1].startsWith("Character")) {
            for (String str : split[0].split(",")) {
                if (split.length == 3) {
                    char aux = split[2].charAt(0);
                    this.varChar.put(split[0], aux);
                } else {
                    this.varChar.put(split[0], null);
                }
            }
            showChar();
        }

    }

    private void show(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println("Array[" + i + "]: " + s[i]);
        }
    }

    private void showInt() {
        for (String key : this.varInt.keySet()) {
            System.out.println("Key Int: " + key + ", value: " + this.varInt.get(key));
        }
    }

    private void showFloat() {
        for (String key : this.varFloat.keySet()) {
            System.out.println("Key Float: " + key + ", value: " + this.varFloat.get(key));
        }
    }

    private void showBoolean() {
        for (String key : this.varBoolean.keySet()) {
            System.out.println("Key Boolean: " + key + ", value: " + this.varBoolean.get(key));
        }
    }

    private void showChar() {
        for (String key : this.varChar.keySet()) {
            System.out.println("Key Boolean: " + key + ", value: " + this.varChar.get(key));
        }
    }

}
