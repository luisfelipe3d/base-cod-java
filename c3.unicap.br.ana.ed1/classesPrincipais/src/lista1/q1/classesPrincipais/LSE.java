package lista1.q1.classesPrincipais;
import lista1.q1.classesBase.Aluno;
import java.util.Scanner;

public class LSE {
    private Node first; //endereço do primeiro nó
    private Node last; //endereço do ultimo nó
    private int qtd; //qtd de nós
    
    public boolean isEmpty(){
        return this.qtd == 0;
    }
 
    public void inserirInicio(Aluno value){
        Node aux = new Node(value);
        if(this.isEmpty()){
            this.first = aux;
            this.last = aux;
            this.qtd++;
        }else{
            aux.setNext(this.first);
            this.first = aux;
            this.qtd++;
        }
    } // fim inserirInicio
    
    public void inserirFinal(Aluno value){
        Node novo = new Node(value);
        if(this.isEmpty()){
            this.first = novo;
            this.last = novo;
            this.qtd++;
        }else{
            this.last.setNext(novo);
            this.last = novo;
            this.qtd++;
        }
    } // fim inserirFinal
    
    
    public void exibirTodos(){
        if(this.isEmpty()){
            System.out.println("Lista vazia.");
        }else{
            Node aux = this.first;
            for(int i = 0; i < this.qtd; i++){
                System.out.printf("Elemento [%d]: %s\n",(i+1),aux.getInfo());
                aux = aux.getNext();
            }
        }
    }
        
    public void inserir(Aluno value){
        Node novo = new Node(value);
        if(this.isEmpty()){
            this.first = novo;
            this.last = novo;
            this.qtd++;
        }else if(value.compareTo(this.first.getInfo()) == 0){//igual ao primeiro
            System.out.println("Aluno já cadastrado!");
        }else if(value.compareTo(this.first.getInfo()) < 0){//inserção no início
            novo.setNext(this.first);
            this.first = novo;
            this.qtd++;
        }else if(value.compareTo(this.last.getInfo()) == 0){ //igual ao último
            System.out.println("Aluno já cadastrado!");
        }else if(value.compareTo(this.last.getInfo()) > 0){ //inserção no final
            this.last.setNext(novo);
            this.last = novo;
            this.qtd++;
        }else{ //inserir no meio
            Node anterior = this.first;
            Node atual = anterior.getNext();
            
            while(true){
                if(atual.getInfo().compareTo(value) == 0){
                    System.out.println("Aluno já cadastrado!");
                    return;
                }else if(atual.getInfo().compareTo(value) > 0){
                    anterior.setNext(novo);
                    novo.setNext(atual);
                    this.qtd++;
                    System.out.println("Inserção efetuada!");
                    return;
                }else{
                    atual = atual.getNext();
                    anterior = anterior.getNext();
                } //fim else
            } // fim while
        } // fim else inserir no meio
    } // fim inserir
    
    public void removerInicio(){
        if(this.isEmpty()){
            System.out.println("Lista vazia.(RemoverInicio)");
        }else if(this.qtd == 1){
            this.first = null;
            this.last = null;
            this.qtd--;
        }else{
            this.first = this.first.getNext();
            this.qtd--;
        }
    }
    
    public void removerFinal(){
        if(this.isEmpty()){
            System.out.println("Lita vazia.(RemoverFinal)");
        }else if(this.qtd == 1){
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
    }//fim removerFinal
} // fim LSE
