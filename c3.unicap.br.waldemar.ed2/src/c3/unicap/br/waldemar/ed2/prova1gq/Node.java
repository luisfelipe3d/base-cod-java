/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3.unicap.br.waldemar.ed2.prova1gq;

/**
 *
 * @author home
 */
abstract class Node <T, V extends Comparable<V>> {
    protected Node<T,V> pai;
    protected Node<T,V>[] filhos;
    protected Integer qtd;
    protected Object keys[];
    
    public Node(int tamMax){
        this.pai = null;
        this.filhos = new Node[tamMax];
        this.qtd = 0;
        this.keys = new Object[tamMax];
    }
    
    abstract T buscar(V key);
    
    abstract Node<T,V> inserir(T value, V key);
    
    abstract Folha<T,V> atualizaEsq();
}
