/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3.unicap.br.monitoria.ed1.aplicacao.lista1;

/**
 *
 * @author home
 */
public class Application {
    
    
    public static void main(String[] args) {
        LSE<Integer> lista = new LSE<>();
        System.out.println("List address memory: "+lista);
        lista.show();
        lista.insertNode(Integer.MIN_VALUE);
        lista.insertNode(-500);
        lista.insertNode(-200);
        lista.insertNodeFinal(Integer.MAX_VALUE);
        lista.insertNodeFinal(300);
        lista.insertNodeFinal(600);
        lista.show();
        
    }
}
