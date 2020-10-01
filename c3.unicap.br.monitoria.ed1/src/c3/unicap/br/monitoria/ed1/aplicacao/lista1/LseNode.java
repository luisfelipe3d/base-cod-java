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
class LseNode <T>{
    
    private LseNode<T> next;
    private T info;

    public LseNode(T info) {
        this.info = info;
    }

    public LseNode<T> getNext() {
        return next;
    }

    public void setNext(LseNode<T> next) {
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    
}
