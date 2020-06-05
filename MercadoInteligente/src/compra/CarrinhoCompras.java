package compra;

import java.util.ArrayList;
import java.util.List;

import estoque.Produto;
import administrativo.Loja;

//Classe implementada por Aline Lira
public class CarrinhoCompras {

    private Loja mercado;
    private List<Produto> produtos;

    public CarrinhoCompras(Loja mercado) {
        this.mercado = mercado;
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarItem(int codigo) {
        produtos.add(mercado.getEstoque().getProdutos().get(codigo));
    }

    public void removerItem(int codigo) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.getCodigo() == codigo) {
                produtos.remove(i);
            }
        }
    }

    public void atualizarQuantidade() {
    }

    public void listarProdutos() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
    }

    public void finalizarCompra() {
        Pedido novoPedido = new Pedido(produtos);
        //pagamento
        produtos.clear();
    }

}
