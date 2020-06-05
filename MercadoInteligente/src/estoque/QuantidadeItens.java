package estoque;

public class QuantidadeItens {

    private Produto produto;
    private int quantidade;

    public QuantidadeItens(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void aumentarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void diminuirQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double calcularTotal() {
        return this.produto.getPreco() * quantidade;
    }

}
