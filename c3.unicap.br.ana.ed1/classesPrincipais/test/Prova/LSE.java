/*

 */
package Prova;

public class LSE <T extends Comparable<T>> {
    private Node<T> first;
    private Node<T> last;
    private int qtd;
    
    public boolean isEmpty(){
        return this.qtd == 0;
    }
    
    public void inserirOrdenado(T value){
        Node <T> novo = new Node (value);
        if(this.isEmpty()){ // lista vazia
            this.first = novo;
            this.last = novo;
            this.qtd++;
        }else{ // lista não vazia
            if(value.compareTo(this.first.getInfo()) < 0){
                novo.setNext(this.first);
                this.first = novo;
                this.qtd++;
            }else if(value.compareTo(this.last.getInfo()) > 0){
                this.last.setNext(novo);
                this.last = novo;
                this.qtd++;
            }else{
                Node <T> ant = this.first;
                Node <T> atual = this.first.getNext();
                while(atual != this.last){
                    if(atual.getInfo().compareTo(value) > 0){
                        ant.setNext(novo);
                        novo.setNext(atual);
                        this.qtd++;
                    }
                    ant = ant.getNext();
                    atual = atual.getNext();
                } // fim while
            } // fim inserir no meio  
        } // fim else não vazia
    } //fim inserirOrdenado
    
    
} // fim classe LSE
