/*
implementar uma lista simplesmente encadeada 
métodos: isEmpty(), insertNode(), insertNodeFinal(), show().
 */
package c3.unicap.br.monitoria.ed1.aplicacao.lista1;

/**
 *
 * @author home
 */
public class LSE<T> {
    
    private LseNode<T> first,last;
    private int qtd;
    
    public boolean isEmpty(){
        return this.qtd == 0;
    }
    
    /**
     * Insere um objeto genérico no inicio da lista.
     *  @param value T - um object genérico do tipo T.
     */
    public void insertNode(T value){
        LseNode aux = new LseNode(value);
        if(isEmpty()){//caso 1. insere na lista vazia
            this.first = aux;
            this.last = aux;
        } else {
            aux.setNext(this.first);
            this.first = aux;
        }
        this.qtd++;
    }
    
    public void insertNodeFinal(T value){
        LseNode aux = new LseNode(value);
        if(isEmpty()){
            this.first = aux;
            this.last = aux;
        } else {
            this.last.setNext(aux);
            this.last = aux;
        }
        this.qtd++;
    }
    
    public void show(){
        LseNode aux = this.first;
        if(isEmpty()){
            System.out.println("Empty list.");
        }
        System.out.print("Value of type T: { ");
        while(aux != null){
            System.out.print(aux.getInfo()+", ");
            aux = aux.getNext();
        }
        System.out.print("}.\n");
        System.out.println("QTD: "+this.qtd);
    }
}
