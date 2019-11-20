
package lista3.q3.classesPrincipais;


class Node {
    private Integer info;
    private Node next;
    
    Node(Integer value){
        this.info = value;
    }
    
    void setInfo(Integer value){
        this.info = value;
    }
    
    Integer getInfo(){
        return this.info;
    }
    
    void setNext(Node next){
        this.next = next;
    }
    
    Node getNext(){
        return this.next;
    }
    
    
}
