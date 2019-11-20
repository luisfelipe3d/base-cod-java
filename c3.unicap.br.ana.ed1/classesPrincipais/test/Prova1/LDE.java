/*
remover generico ordenando crescente sem repetidos
 */
package Prova1;

public class LDE <T extends Comparable <T>>{
    
    private Node<T> first;
    private Node<T> last;
    private int qtd;
    
    public boolean isEmpty(){
        return this.qtd == 0;
    }
    
    private Node<T> buscaMelhorada(T value){
        Node <T> aux = this.first;
        if(this.isEmpty()){
            return null;
        }else{
            while(aux != null){
                if(value.compareTo(aux.getInfo()) == 0 || 
                        value.compareTo(aux.getInfo()) > 0){
                    return aux;
                }
                aux = aux.getNext();
            }
            return null;
        } // fim else lista não vazia
    } // fim buscaMelhorada
    
    public void removerOrdenado(T value){
        Node <T> ant,atual;
        Node <T> aux = buscaMelhorada(value);
        if(this.isEmpty()){
            System.out.println("Lista vazia");
        }else if(this.qtd == 1){
            if(this.first.getInfo().compareTo(value) == 0){
                this.first = null;
                this.last = null;
                this.qtd--;
            }else{
                System.out.println("Elemento não encontrado");
            } // fim remocao com um elemento
        }else if(this.first.getInfo().compareTo(value) == 0){ // remocao no inicio
            this.first = this.first.getNext();
            this.first.setPrev(null);
            this.qtd--;
        }else if(this.last.getInfo().compareTo(value) == 0){ // remocao no final
            this.last = this.last.getPrev();
            this.last.setNext(null);
            this.qtd--;
        }else{//remocao no meio
            ant = aux.getPrev();
            atual = aux;
            
            if(aux != null){
                if(aux.getInfo().compareTo(value) == 0){
                    ant.setNext(atual.getNext());
                    atual.setPrev(ant);
                    this.qtd--;
                }else{
                    System.out.println("Nao encontrado.");
                }
            }else{
                System.out.println("Valor não encontrado.");
            }
        } // fim remocao no meio
    } // fim removerOrdenado
} // fim LDE
