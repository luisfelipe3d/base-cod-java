/*
Node generico
 */
package Prova;

/**
 *
 * @author home
 */
class Node <T>{
    private T info;
    private Node<T> next;
    
    Node(T info){
        this.info = info;
    }
    
    T getInfo(){
        return this.info;
    }
    
    void setInfo(T value){
        this.info = value;
    }
    
    Node <T> getNext(){
        return this.next;
    }
    
    void setNext(Node <T> value){
        this.next = value;
    }
}
