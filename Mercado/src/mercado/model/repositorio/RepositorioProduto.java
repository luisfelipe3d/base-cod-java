package mercado.model.repositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mercado.model.Produto;
import mercado.Interface.IProduto;

public class RepositorioProduto implements IProduto {
    protected List<Produto> listaProdutos = new ArrayList();

    @Override
    public boolean cadastrarProduto(Produto produto) {
        if(buscarProduto(produto)){
            return false;
        }
        return this.listaProdutos.add(produto);
    }

    @Override
    public boolean alterarQuantidade(Produto produto, int quantidade) {
        if(this.buscarProduto(produto)){
            int index = this.listaProdutos.indexOf(produto);
            this.listaProdutos.get(index).setQtdEstoque(quantidade);
            return true;
        }        
        return false;
    }

    @Override
    public List listarProdutos() {
        return Collections.unmodifiableList(listaProdutos);
    }

    @Override
    public boolean removerProduto(Produto produto) {
        if(!buscarProduto(produto)){
            return false;
        }
        return this.listaProdutos.remove(produto);
    }

    @Override
    public boolean buscarProduto(Produto produto) {
        return this.listaProdutos.contains(produto);
    }
}
