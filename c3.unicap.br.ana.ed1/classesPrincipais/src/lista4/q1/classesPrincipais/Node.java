package lista4.q1.classesPrincipais;
import lista4.q1.classesBase.Aluno;
 

class Node {
    private Node prev;
    private Aluno info;
    private Node next;
    
    Node(Aluno a){
        this.info = a;
    }
    
    void setInfo(Aluno a){
        this.info = a;
    }
    
    Aluno getInfo(){
        return this.info;
    }
    
    void setNext(Node next){
        this.next = next;
    }
    
    Node getNext(){
        return this.next;
    }
    
    void setPrev(Node prev){
        this.prev = prev;
    }
    
    Node getPrev(){
        return this.prev;
    }
}
