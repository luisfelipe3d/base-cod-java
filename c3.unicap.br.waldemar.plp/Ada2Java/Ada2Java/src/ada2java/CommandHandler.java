
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
            String msg = searchMsg(s);
            s = s.replaceAll(msg, "");
            s = s.replaceAll("&", "");
            s = s.replaceAll("\"+", "").trim();
            String parametroBusca = getParameter(s);
            s = prepareString(s);
            System.out.print(msg);
            getType(s,parametroBusca);
            
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
            int removeP = s.indexOf("(");
            int removePf = s.lastIndexOf(")");
            int removeSemiColon = s.lastIndexOf(";");
            if (removeSemiColon != -1){
                return s.substring(removeP+1, removePf);
            } else {
                return s.substring(0,removeP);
            }
        }
        return null;
    }
    
    private String getParameter(String s){
        if(!s.isEmpty()){
            int inicioP = s.indexOf("(");
            int fimP = s.lastIndexOf(")");
            if (inicioP != -1 && fimP != -1) {
                return s.substring(inicioP + 1, fimP);
            }
        }
        return null;
    }
    
    private void getType(String t, String value){         
        final String INTEIRO = "Integer'Image";
        final String FLOAT = "Float'Image";
        final String CHARACTER = "Character'Image";
        final String BOOLEAN = "Boolean'Image";
        switch(t){
            case INTEIRO:
                Integer v = this.var.getInt(value);
                System.out.println(v);
                break;
            case FLOAT:
                Float f = this.var.getFloat(value);
                System.out.println(f);
                break;
            case CHARACTER:
                Character c = this.var.getCharacter(value);
                System.out.println(c);
                break;
            case BOOLEAN:
                Boolean b = this.var.getBoolean(value);
                System.out.println(b);
                break;
            default:
                System.out.println("Tipo não reconhecido.");
        }
    }
    

}
