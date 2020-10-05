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
class LDENode <T extends Comparable<T>>{
    private LDENode<T> first,last;
    private T info;

    public LDENode(T info) {
        this.info = info;
    }

    public LDENode<T> getFirst() {
        return first;
    }

    public void setFirst(LDENode<T> first) {
        this.first = first;
    }

    public LDENode<T> getLast() {
        return last;
    }

    public void setLast(LDENode<T> last) {
        this.last = last;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    
}
