
package lista2.q2.classesPrincipais;
import lista2.q2.classesBase.Produto;

class Node {
    private Produto info;
    private Node next;
    
    Node(Produto codigo){
        this.info = codigo;
    }
    void setInfo(Produto value){
        this.info = value;
    }
    Produto getInfo(){
        return this.info;
    }
    void setNext(Node next){
        this.next = next;
    }
    Node getNext(){
        return this.next;
    }
    
}
