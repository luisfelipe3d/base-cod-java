package mercado.controller;

import java.util.List;
import mercado.Interface.IProduto;
import mercado.model.Produto;
import mercado.model.repositorio.RepositorioProduto;

public class ControladorProduto {
    private IProduto repositorioProduto;
    
    public ControladorProduto(){
        this.repositorioProduto = new RepositorioProduto();
    }
    
    public boolean cadastrarProduto(Produto produto){
        return this.repositorioProduto.cadastrarProduto(produto);
    }
    
    public boolean alterarQuantidade(Produto produto, int quantidade){
        return this.repositorioProduto.alterarQuantidade(produto, quantidade);
    }
    
    public List listarProdutos(){
        return this.repositorioProduto.listarProdutos();
    }
    
    public boolean removerProduto(Produto produto){
        return this.repositorioProduto.removerProduto(produto);
    }
    
}
