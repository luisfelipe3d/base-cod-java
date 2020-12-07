/*
1 public static void salvar(String arquivo, String dados) {
2	  try {
3	  	OutputStream out = new FileOutputStream(arquivo);
4		out.write(dados.getBytes());
5		out.close();
6	  } catch (Exception e) {
7		e.printStackTrace();
8	  }
9 }

O código acima pode gerar exceções em três pontos: ao abrir o arquivo  
(linha 3), escrever os dados (linha 4) ou fechar o arquivo (linha 5). 
Com base  nisso responda:

 */
package prova2gq.questao2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author home
 */
public class Aplicacao {
    public static void main(String[] args) {
        
    }
    
    public static void salvar(String arquivo, String dados) throws IOException{
        OutputStream out = null;
        try{
            File fl = new File(arquivo);
            if(!fl.exists() && fl.canWrite()){
                fl.createNewFile();
            }
            out = new FileOutputStream(fl);
            byte[] bytes = dados.getBytes("UTF-8");
            out.write(bytes);
        } catch (IOException ex) {
            System.err.println("Erro ao fechar arquivo."+ex.getMessage());
        } finally {
            if(out != null){
                out.close();
            }
        }
    }
}


