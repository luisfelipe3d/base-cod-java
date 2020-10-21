/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author home
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //final String ARQ_FILE = "src/ada2java/assets/checkpositive.adb";
        File arquivo = new File("src/ada2java/assets/ComandoEntrada.adb");
        
        VariableHandler var = VariableHandler.getInstance();
        CommandHandler com = new CommandHandler();
        AdaHandler handler = null;
        FileReader fl = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fl);
        try{
            for(String line; (line = br.readLine()) != null;){
                if(line.startsWith("with")){
                    continue;
                } else if(line.startsWith("procedure")){
                    handler = var;
                    continue;
                } else if(line.startsWith("begin")){
                    handler = com;
                    continue;
                } else if(line.startsWith("end")){
                    handler = com;
                    continue;
                } 
                if(handler != null){
                    handler.addLine(line);
                }
            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            br.close();
            fl.close();
        }
    }
    
}
