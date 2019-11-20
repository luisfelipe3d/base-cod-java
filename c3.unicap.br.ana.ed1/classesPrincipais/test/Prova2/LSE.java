
package Prova2;

public class LSE {

    private Node first;
    private Node last;
    private int qtd;

    private boolean isEmpty() {
        return this.qtd == 0;
    }

    public LSE copiar(LSE lista) {
        LSE copia = new LSE(); //cria nova lista vazia
        Node aux = lista.first;
        Produto p;
        if (!lista.isEmpty()) {
            while (aux != null) {
                p = new Produto(aux.getInfo().getCodigo());
                p.setPreco(aux.getInfo().getPreco());
                p.setQtd(aux.getInfo().getQtd());
                p.setDescricao(aux.getInfo().getDescricao());
                //objeto criado com todas as informações
                copia.inserirFinal(p);
                aux = aux.getNext();

            }
        }
        return copia;
    }
    
    /*MAIN
    LSE lista = new LSE();
    LSE copia = new LSE();
    copia.copiar2(lista);
    
    */

    public void copiar2(LSE lista) {
        Node aux = lista.first;
        Produto p;
        if(lista.isEmpty()){
            return;
        }
        else{
            while (aux != null) {
                p = new Produto(aux.getInfo().getCodigo());
                p.setPreco(aux.getInfo().getPreco());
                p.setQtd(aux.getInfo().getQtd());
                p.setDescricao(aux.getInfo().getDescricao());
                //objeto criado com todas as informações
                this.inserirFinal(p);
                //caso seja cópia invertida, passa a ser inserirInicio em vez d inserirFinal
                aux = aux.getNext();
            }
        }
    }

    public void inserirFinal(Produto p) {
        Node novo = new Node(p);
        if (this.isEmpty()) {
            this.first = novo;
            this.last = novo;
            this.qtd++;
        } else {
            this.last.setNext(novo);
            this.last = novo;
            this.qtd++;
        }
    }
}
