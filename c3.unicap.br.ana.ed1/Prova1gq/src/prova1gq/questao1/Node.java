/*
Classe Node genérico
 */
package prova1gq.questao1;

class Node <T>{
    private Node<T> prev;
    private Node<T> next;
    private T info;
    
    Node(T info){
        this.info = info;
    }
    
    Node<T> getPrev(){
        return this.prev;
    }
    
    void setPrev(Node<T> prev){
        this.prev = prev;
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
} // fim Node LDE geerico
