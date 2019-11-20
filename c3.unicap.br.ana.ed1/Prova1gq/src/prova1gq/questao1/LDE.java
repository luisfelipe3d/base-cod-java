/*
Classe LDE ordenada decrescente método remover genérico.
 */
package prova1gq.questao1;

public class LDE <T extends Comparable<T>> {
    private Node first;
    private Node last;
    private int qtd;
    
    public boolean isEmpty(){
        return this.qtd == 0;
    }
    
    private Node<T> buscar(T value){
        Node <T> aux = this.first;
        if(this.isEmpty()){
            return null;
        }else{
            while(aux != null){
                if(aux.getInfo().compareTo(value) == 0){
                    return aux;
                }else if(aux.getInfo().compareTo(value) < 0){
                    return null;
                }
                aux = aux.getNext();
            }
            return null;
        }
    }
    
    public void removerOrdenado(T value){
        if(this.isEmpty()){
            System.out.println("Lista vazia");
        }else if(this.qtd == 1){
            //if(value.compareTo(this.first.getInfo()) == 0){
                this.first = null;
                this.last = null;
                this.qtd--;
            }else{
                System.out.println("Valor não encontrado.");
            }
        }else{
            Node <T> result = this.buscar(value);
            if(result == null){
                System.out.println("Valor não encontrado. ");
            }else{
                if(result == this.first){
                    this.first = this.first.getNext();
                    this.first.setPrev(null);
                    this.qtd--;
                }else if(result == this.last){
                    this.last = this.last.getPrev();
                    this.last.setNext(null);
                    this.qtd--;
                }else{
                    Node <T> ant = result.getPrev();
                    Node <T> prox = result.getNext();
                    ant.setNext(prox);
                    prox.setPrev(ant);
                    this.qtd--;
                }
            }
        }
    }
}
