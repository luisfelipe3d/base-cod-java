/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1.q1.classesPrincipais;
import lista1.q1.classesBase.Aluno;

class Node {
    private Aluno info;
    private Node next;
    
    Node(Aluno info){
        this.info = info;
    }
    void setInfo(Aluno value){
        this.info = value;
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
}

