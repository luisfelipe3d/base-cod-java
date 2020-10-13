/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author joaot
 */
public class CommandHandler implements AdaHandler{

    //Put_Line("Digite seu nome: ");
    //Put (N);
    List<Integer> varStack = new ArrayList<>();
    Map<String,String> varPlus = new HashMap<>();
    
    @Override
    public void addLine(String s) {
        String[] split;
        if(s.contains("Put_Line")){
            
            s = prepareString(s);
            //int removePut = s.indexOf("(")+1;
            //s = s.substring(removePut, s.length());
            String msg = searchMsg(s);
            //System.out.println(msg);
            //s = s.replaceAll(" ", "");
            
            int removeMsg = s.lastIndexOf('"')+1;
            //s = s.substring(removeMsg, s.length());
            //System.out.println(s);
            
            int searchAmpersand = s.indexOf("&");

        }
        
    }
    
    private String searchMsg(String s){
        List<Integer> indice = new ArrayList<>();
        int indexInicio, indexFim;
        String r = null;
        char[] sequencia = s.toCharArray();
        if(!s.isEmpty()){
            for(int i = 0; i < s.length(); i++){
                if(sequencia[i] == '"'){
                    indice.add(i);
                }
            }
            indexInicio = indice.get(0) + 1;
            indexFim = indice.get(1);
            r = s.substring(indexInicio, indexFim);
            if(indice.size() == 4){
                indexInicio = indice.get(2) + 1;
                indexFim = indice.get(3);
                r = r + s.substring(indexInicio, indexFim);
            }
            System.out.println("valor de r: " + r);
            indice.removeAll(indice);
            return r;
        }
        return null;
    }
    
    private String prepareString(String s){
        if(!s.isEmpty()){
            s = s.trim();
            int removeP = s.indexOf("(") + 1;
            int removePf = s.lastIndexOf(")");
            int searchSemiColon = s.indexOf(";");
            if (removePf + 1 == searchSemiColon) {
                System.out.println(s.substring(removeP, removePf));
                return s.substring(removeP, removePf);
            }
        }
        return null;
    }
    
}
