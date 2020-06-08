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
    
    public boolean alterarQuantidade(int codigo, int quantidade){
        return this.repositorioProduto.alterarQuantidade(codigo, quantidade);
    }
    
    public List listarProdutos(){
        return this.repositorioProduto.listarProdutos();
    }
    
    public boolean removerProduto(int codigo){
        return this.repositorioProduto.removerProduto(codigo);
    }
    
    public int buscarProcuto(int codigo){
        return this.repositorioProduto.buscarProduto(codigo);
    }
    
    public Produto retornarProduto(int codigo){
        return this.repositorioProduto.retornarProduto(codigo);
    }
}
