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
class LDENode <T>{
    private LDENode<T> prev,next;
    private T info;

    public LDENode(T info) {
        this.info = info;
    }

    public LDENode<T> getPrev() {
        return prev;
    }

    public void setPrev(LDENode<T> prev) {
        this.prev = prev;
    }

    public LDENode<T> getNext() {
        return next;
    }

    public void setNext(LDENode<T> next) {
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    
}
