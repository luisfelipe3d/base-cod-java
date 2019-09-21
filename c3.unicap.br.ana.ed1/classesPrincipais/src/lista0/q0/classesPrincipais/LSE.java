package lista0.q0.classesPrincipais;

public class LSE {
    private Node first;
    private Node last;
    private int qtd;
    
    public boolean isEmpty(){
        return this.qtd == 0;
    }
    
    public void listar(){
        if(this.isEmpty()){
            System.out.println("Lista vazia.(Exibir)");
        }else{
            Node aux = this.first;
            for(int i = 0; i < this.qtd; i++){
                System.out.printf("Elemento [%d]. Nº: %d\n",(i+1),aux.getInfo());
                aux = aux.getNext();
            }
        } //Lista não vazia
    } //fim exibir
    
    public void inserirInicio(Integer value){
        Node novo = new Node(value);
        if(this.isEmpty()){
            this.first = novo;
            this.last = novo;
            this.qtd++;
        }else{
            novo.setNext(this.first);
            this.first = novo;
            this.qtd++;
        }
    }
    
    public void inserirFinal(Integer value){
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
    }
    
    public void removerInicio(){
        if(this.isEmpty()){
            System.out.println("Lista vazia.(Inicio)");
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
            System.out.println("Lista vazia. (Final)");
        }else if(this.qtd == 1){
            this.first = null;
            this.last = null;
            this.qtd--;
        }else{
            Node aux = this.first;
            while(aux.getNext() != this.last){
                aux = aux.getNext();
            }
            this.last = aux;
            this.last.setNext(null);
            this.qtd--;
        }
    }
}
