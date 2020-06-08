package mercado.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mercado.Interface.IProduto;
import mercado.model.DescontoProduto;
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
    
    public boolean aplicarDescontoAleatorio(){
        DescontoProduto descontoProduto = new DescontoProduto((RepositorioProduto)this.repositorioProduto);
        Thread concorrencia = new Thread(descontoProduto);
        concorrencia.start();
        
        try {
            concorrencia.join();
            return true;
        } catch (InterruptedException ex) {
            Logger.getLogger(ControladorProduto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
