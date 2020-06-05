package estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    protected List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<Produto>();
    }

    public void cadastrarProduto(Produto p) {
        produtos.add(p);
    }

    public void reabastecerEstoque() {

    }

    public void listarProdutos() {
        for (int i = 0; i < this.produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

}
