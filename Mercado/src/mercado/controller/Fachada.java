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
    public boolean removerCliente(UsuarioCliente cliente) {
        return this.controladorCliente.remover(cliente);
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
    public boolean alterarQuantidade(Produto produto, int quantidade) {
        return this.controladorProduto.alterarQuantidade(produto, quantidade);
    }

    @Override
    public List visualizarProdutos() {
        return this.controladorProduto.listarProdutos();
    }

    @Override
    public boolean removerProduto(Produto produto) {
        return this.controladorProduto.removerProduto(produto);
    }
    
}
