/*
Lista não ordenada e não pode conter repetidos
*/

package lista2.q2.classesPrincipais;
import lista2.q2.classesBase.Produto;


public class LSE {
    private Node first;
    private Node last;
    private int qtd;
    
    public boolean isEmpty(){
        return this.qtd == 0;
    }
    
    private Produto buscar(String codigo){
        if(this.isEmpty()){
            return null;
        }else{
            Node aux = this.first;
            while(aux != null){
                if(aux.getInfo().getCodigo().compareTo(codigo) == 0){
                    return aux.getInfo();
                }
                aux = aux.getNext();
            }
        }
        return null;
    } // fim buscar
            
    public void inserirInicio(Produto value){  
        if(this.isEmpty()){
            Node novo = new Node(value);
            this.first = novo;
            this.last = novo;
            this.qtd++;
        }else{
            Produto aux = this.buscar(value.getCodigo());
            if(aux != null){
                System.out.println("Produto já cadastrado.(Inicio)");
            }else{
                Node novo = new Node(value);
                novo.setNext(this.first);
                this.first = novo;
                this.qtd++;
            } // elemento não encontrado na lista, é inserido.
        } // lista não vazia
    } //fim inserirInicio
    
    public void inserirFinal(Produto value){
        if(this.isEmpty()){
            Node novo = new Node(value);
            this.first = novo;
            this.last = novo;
            this.qtd++;
        }else{
            Produto aux = this.buscar(value.getCodigo());
            if(aux != null){
                System.out.println("Produto já cadastrado.(Inserir Final)");
            }else{
                Node novo = new Node(value);
                this.last.setNext(novo);
                this.last = novo;
                this.qtd++;
            } // inserir no final elemento não encontrado.
        } // else não vazio 
       } // fim inserirFinal
    
    public void removerInicio(){
        if(this.isEmpty()){
            System.out.println("Lista vazia.(removerInicio)");
        }else if(this.qtd == 1){
            this.first = null;
            this.last = null;
            this.qtd--;
        }else{
            this.first = this.first.getNext();
            this.qtd--;
        }
    }// fim removerInicio
    
    public void removerFinal(){
        if(this.isEmpty()){
            System.out.println("Lita vazia.(removerFinal)");
        }else if (this.qtd == 1){
            this.first = null;
            this.last = null;
            this.qtd--;
        }else{
            Node aux = this.first;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            this.last = aux;
            this.last.setNext(null);
            this.qtd--;
        }
    } // fim removerFinal
    
    public void listarProdutos(){
        if(this.isEmpty()){
            System.out.println("Lista vazia.");
        }else{
            Node aux = this.first;
            for(int i = 1; i <= this.qtd; i++){
                System.out.printf("Elemento[%d]: %s",i,aux.getInfo());
                aux = aux.getNext();
            }
        }
    }
    
    public void exibirProduto(String codigo){
        Produto aux = this.buscar(codigo);
        if(aux == null){
            System.out.println("Produto não encontrado");
        }else{
            System.out.println(aux);
        }
    }
    
    public void removerProduto(String codigo){
        if(this.isEmpty()){
            System.out.println("Lista vazia.(RemoverProduto)");
        }else{
            Produto aux = this.buscar(codigo);
            if(aux == null){
                System.out.println("Produto não encontrado");
            }else{ 
                // remover inicio
                if(this.first.getInfo().getCodigo().compareTo(codigo) == 0){
                    if(this.qtd == 1){
                        this.first = null;
                        this.last = null;
                        this.qtd--;
                    }else{
                        this.first = this.first.getNext();
                        this.qtd--;
                    } // fim else
                    System.out.println("Removido no Inicio.");
                } // fim removerInicio
                else if(this.last.getInfo().getCodigo().compareTo(codigo) == 0){
                    //remover final
                    if(this.qtd == 1){
                        this.first = null;
                        this.last = null;
                        this.qtd--;
                    }else{
                        Node novo = this.first;
                        while(novo.getNext() != null){
                            novo = novo.getNext();
                        }
                        this.last = novo;
                        this.last.setNext(null);
                        this.qtd--;
                    } // nó removido
                    System.out.println("Removido no Final.");
                } // fim remoção final
                else{
                    //remover no meio
                    Node ant = this.first;
                    Node atual = this.first.getNext();
                    while(atual.getNext() != null){
                        //achou o ponto de remoção no meio
                        if(atual.getInfo().getCodigo().compareTo(codigo) == 0){
                            ant.setNext(atual.getNext());
                            this.qtd--;
                        }
                        ant = ant.getNext();
                        atual = atual.getNext();
                    } // fim while
                    System.out.println("Removido no Meio.");
                } // fim remover no meio
            } // fim remoção
        } // else da lista não vazia
    } // fim procedimento removerProduto
} // fim LSE
