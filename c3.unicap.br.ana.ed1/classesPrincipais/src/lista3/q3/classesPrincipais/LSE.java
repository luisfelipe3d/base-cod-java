/*
1 - Implemente um método para inserir um valor em uma lista simplesmente 
encadeada que está ordenada em ordem crescente. A lista permite a existência de
valores repetidos. Valores repetidos devem ser inseridos ANTES dos iguais a ele.
2 - Implemente um método para inserir um valor em uma lista simplesmente
encadeada que está ordenada em ordem crescente. A lista permite a existência de
valores repetidos. Valores repetidos devem ser inseridos APÓS todos os iguais a
ele.

 */
package lista3.q3.classesPrincipais;

public class LSE {
    private Node first;
    private Node last;
    private int qtd;
    
    public boolean isEmpty(){
        return this.qtd == 0;
    }
    
    public void inserir1(Integer value){
        if(this.isEmpty()){
            Node novo = new Node(value);
            this.first = novo;
            this.last = novo;
            this.qtd++;
        }else{
            Node ant = this.first;
            Node atual = this.first.getNext();
            
            while(atual.getNext() != null){
                
            }
        }
    }
    
    
}
