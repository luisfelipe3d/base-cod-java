
package ada2java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CommandHandler implements AdaHandler{

    private Map<String,String> varPlus = new HashMap<>();
    private VariableHandler var = VariableHandler.getInstance();
    
    @Override
    public void addLine(String s) {
        if(s.contains("Put_Line")){
            s = prepareString(s);
            System.out.println("1. "+s);
            String msg = searchMsg(s);
            s = s.replaceAll(msg, "");
            s = s.replaceAll("&", "");
            s = s.replaceAll("\"+", "").trim();
            System.out.println("3. "+s);
            String tmp = getParameter(s);
            String a = getType(tmp);
            Integer valor = var.getInt(tmp);
            System.out.println(msg+valor);
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
            int removeSemiColon = s.indexOf(";");
            if (removePf + 1 == removeSemiColon) {
                return s.substring(removeP, removePf);
            }
        }
        return null;
    }
    
    private String getParameter(String s){
        int inicioP = s.indexOf("(");
        int fimP = s.lastIndexOf(")");
        String tmp;
        if(inicioP != -1 && fimP != -1){
            return tmp = s.substring(inicioP+1,fimP);
        }
        return null;
    }
    
    private String getType(String t){         
        final String INTEIRO = "Integer'Image";
        final String FLOAT = "Float'Image";
        final String CHARACTER = "Character'Image";
        final String BOOLEAN = "Boolean'Image";
        
        switch(t){
            case INTEIRO:
                break;
            case FLOAT:
                break;
            case CHARACTER:
                break;
            case BOOLEAN:
                break;
        }
        return null;
    }
    
}
