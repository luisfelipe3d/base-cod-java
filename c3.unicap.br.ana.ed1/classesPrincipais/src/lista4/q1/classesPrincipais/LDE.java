package lista4.q1.classesPrincipais;
import lista4.q1.classesBase.Aluno;
import java.util.Scanner;
public class LDE{
    private Node first;
    private Node last;
    private int qtd;
    Scanner in = new Scanner(System.in);
    
    
    public boolean isEmpty(){
        return this.qtd == 0;
    }
    
    public void cadastrar(Aluno a){
        Node novo = new Node(a);
        if(this.isEmpty()){
            this.first = novo;
            this.last = novo;
            this.first.setPrev(this.last);
            this.last.setNext(this.first);
            this.qtd++;
        }else{
            this.last.setNext(novo);
            this.last = novo;
            novo.setNext(this.first);
            this.first.setPrev(novo);
            this.qtd++;
        }
    }
    
    public void listar(){
        if(this.isEmpty()){
            System.out.println("Nenhum aluno cadastrado!");
        }else{
            Node aux = this.first;
            do{
                System.out.println(aux.getInfo());
                aux = aux.getNext();
            }while(aux != this.first);
        }
    }
    
    private Node consultar(String nome){
        if(this.isEmpty()){
            System.out.println("Nenhum aluno cadastrado!");
        }else{
            Node aux = this.first;
            do{
                if(aux.getInfo().getNome().compareToIgnoreCase(nome) == 0){
                    return aux;
                }
                aux = aux.getNext();
            }while(aux != this.first);
        }
        return null;
    }
    
    public void alterarMedia(String nome){
        if(this.isEmpty()){
            System.out.println("Nenhum aluno cadastrado!");
        }else{
            Node aux = consultar(nome);
            if(aux == null){
                System.out.println("Aluno não cadastrado!");
            }else{
                System.out.println("Informe a nova média: ");
                double media = in.nextDouble();
                aux.getInfo().setMedia(media);
            }
        }
    }
    
    public void alterarFaltas(String nome){
        if(this.isEmpty()){
            System.out.println("Nenhum aluno cadastrado!");
        }else{
            Node aux = consultar(nome);
            if(aux == null){
                System.out.println("Aluno não cadastrado!");
            }else{
                System.out.println("Informe a nova quantidade de faltas: ");
                int faltas = in.nextInt();
                aux.getInfo().setFaltas(faltas);
            }
        }
    }
    
    public void exibir(String nome){
        if(this.isEmpty()){
            System.out.println("Nenhum aluno cadastrado!");
        }else{
            Node aux = consultar(nome);
            if(aux == null){
                System.out.println("Aluno não cadastrado!");
            }else{
                System.out.println(aux.getInfo());
            }
        }
    }
    
    public void remover(String nome){
        if(this.isEmpty()){
            System.out.println("Nenhum aluno cadastrado!");
        }else{
            if(this.first.getInfo().getNome().compareToIgnoreCase(nome) == 0){
                if(this.qtd == 1){
                    this.first = null;
                    this.last = null;
                    this.qtd--;
                }else{
                    this.first = this.first.getNext();
                    this.first.setPrev(this.last);
                    this.last.setNext(this.first);
                    this.qtd--;
                }
            }else if(this.last.getInfo().getNome().compareToIgnoreCase(nome) == 0){
                this.last = this.last.getPrev();
                this.last.setNext(this.first);
                this.first.setPrev(this.last);
                this.qtd--;
            }else{
                Node aux = this.first.getNext();
                while(aux != this.last){
                    if(aux.getInfo().getNome().compareToIgnoreCase(nome) == 0){
                        aux.getPrev().setNext(aux.getNext());
                        aux.getNext().setPrev(aux.getPrev());
                        this.qtd--;
                        return;
                    }
                    aux = aux.getNext();
                }
            }
        }
    }
}
