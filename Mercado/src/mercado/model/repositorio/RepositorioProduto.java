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
        if(buscarProduto(produto.getCodigo()) != -1){
            return false;
        }
        return this.listaProdutos.add(produto);
    }

    @Override
    public boolean alterarQuantidade(int codigo, int quantidade) {
        if(this.buscarProduto(codigo) != -1){
            int index = this.buscarProduto(codigo);
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
    public boolean removerProduto(int codigo) {
        if(buscarProduto(codigo) == -1){
            return false;
        }
        this.listaProdutos.remove(buscarProduto(codigo));
        return true;
    }

    @Override
    public int buscarProduto(int codigo) {
        for(int i = 0; i < this.listaProdutos.size(); i++){
            if(this.listaProdutos.get(i).getCodigo() == codigo){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Produto retornarProduto(int codigo) {
        int codigoProduto = this.buscarProduto(codigo);
        if(codigoProduto != -1){
            return this.listaProdutos.get(codigoProduto);
        }else{
            return null;
        }
    }
}
