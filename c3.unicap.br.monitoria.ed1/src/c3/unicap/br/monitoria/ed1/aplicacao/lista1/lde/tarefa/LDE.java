/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3.unicap.br.monitoria.ed1.aplicacao.lista1.lde.tarefa;

/**
 *
 * @author home
 */
public class LDE<T extends Comparable<T>> {
    private LDENode<T> first,last;
    private int qtd;
    
    public boolean isEmpty(){
        return this.qtd == 0;
    }
    
    public void inserir(T value){
        LDENode aux = new LDENode(value);
        if(isEmpty()){
            this.first = aux;
            this.last = aux;
            this.qtd++;  
        } else {
            
        }
    }
}
