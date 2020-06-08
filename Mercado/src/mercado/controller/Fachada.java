package mercado.controller;

import java.util.List;
import mercado.Interface.IFachada;
import mercado.model.Produto;
import mercado.model.UsuarioCliente;

public class Fachada implements IFachada{
    ControladorCliente controladorCliente;
    ControladorProduto controladorProduto;
    
    public Fachada(){
        this.controladorCliente = new ControladorCliente();
        this.controladorProduto = new ControladorProduto();
    }

    @Override
    public boolean cadastrarCliente(UsuarioCliente cliente) {
        return this.controladorCliente.cadastrar(cliente);        
    }

    @Override
    public boolean removerCliente(String CPF) {
        return this.controladorCliente.remover(CPF);
    }

    @Override
    public boolean cadastarAdministrador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cadastrarProdutos(Produto produto) {
        return this.controladorProduto.cadastrarProduto(produto);
    }

    @Override
    public boolean alterarQuantidade(int codigo, int quantidade) {
        return this.controladorProduto.alterarQuantidade(codigo, quantidade);
    }

    @Override
    public List visualizarProdutos() {
        return this.controladorProduto.listarProdutos();
    }

    @Override
    public boolean removerProduto(int codigo) {
        return this.controladorProduto.removerProduto(codigo);
    }

    @Override
    public boolean loginCliente(String CPF, String senha) {
        return this.controladorCliente.login(CPF, senha);
    }

    @Override
    public boolean adicionarProdutoCarrinho(int codigo) {
        Produto produto = this.controladorProduto.retornarProduto(codigo);
        if(produto != null){
            return this.controladorCliente.adicionarItemCarrinho(produto);
        }else{
            return false;
        }
    }

    @Override
    public boolean removerItemCarrinho(int codigo) {
        Produto produto = this.controladorProduto.retornarProduto(codigo);
        if(produto != null){
            return this.controladorCliente.removerItemCarrinho(produto);
        }else{
            return false;
        }
    }
    
}
