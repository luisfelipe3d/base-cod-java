/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova2;

/**
 *
 * @author home
 */
public class Node {
    private Produto info;
    private Node next;
    
    Node(Produto info){
        this.info = info;
    }

    public Produto getInfo() {
        return info;
    }

    public void setInfo(Produto info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
