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

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author home
 */
public class Aplicacao {
    public static void main(String[] args) {
        
    }
    
    public static void salvar(String arquivo, String dados) {
        try {
            OutputStream out = new FileOutputStream(arquivo);
            out.write(dados.getBytes());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}


