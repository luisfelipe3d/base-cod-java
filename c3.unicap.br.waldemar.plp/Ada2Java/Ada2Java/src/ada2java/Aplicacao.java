/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String ARQ_FILE = "src/ada2java/assets/checkpositive.adb";
        
        try{
            File arquivo = new File(ARQ_FILE);
            Scanner arq = new Scanner(arquivo);
            String line;
            while(arq.hasNext()){
                line = arq.nextLine().trim();
                if(line.startsWith("procedure") && line.endsWith("is")){
                    line.
                }
                System.out.println(line);    
            }
            arq.close();
        } catch (IOException e){
            e.getMessage();
        }
    }
    
}
