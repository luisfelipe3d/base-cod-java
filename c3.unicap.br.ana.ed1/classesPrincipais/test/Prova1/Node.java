/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova1;

class Node <T> {
    private Node<T> prev;
    private Node<T> next;
    private T info;
    
    Node(T value){
        this.info = value;
    }
    
    Node<T> getPrev(){
        return this.prev;
    }
    void setPrev(Node<T> value){
        this.prev = value;
    }
    
    Node<T> getNext(){
        return this.next;
    }
    
    void setNext(Node<T> next){
        this.next = next;
    }
    
    T getInfo(){
        return this.info;
    }
    
    void setInfo(T value){
        this.info = value;
    }
    
    
}
