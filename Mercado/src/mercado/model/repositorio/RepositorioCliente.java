package mercado.model.repositorio;

import java.util.ArrayList;
import java.util.List;
import mercado.Interface.IUsuarioCliente;
import mercado.model.Carrinho;
import mercado.model.Produto;
import mercado.model.UsuarioCliente;

public class RepositorioCliente implements IUsuarioCliente{
    private List<UsuarioCliente> listaClientes = new ArrayList();
    private UsuarioCliente clienteLogado;
    private Carrinho carrinhoCompras;
    
    @Override
    public boolean cadastrar(UsuarioCliente cliente) {
        if(this.buscar(cliente.getCPF()) != -1){
            return false;
        }
        return this.listaClientes.add(cliente);
    }

    @Override
    public boolean remover(String CPF) {
        if(this.buscar(CPF) == -1){
            return false;
        }        
        this.listaClientes.remove(this.buscar(CPF));
        return true;
    }
    
    @Override
    public int buscar(String CPF){
        for(int i = 0; i < this.listaClientes.size(); i++){
            if(this.listaClientes.get(i).getCPF().compareTo(CPF) == 0){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean login(String CPF, String senha) {
        if(this.buscar(CPF) != -1){
            int index = this.buscar(CPF);
            
            if(this.listaClientes.get(index).getSenha().equalsIgnoreCase(senha)){
                this.clienteLogado = this.listaClientes.get(index);
                this.carrinhoCompras = new Carrinho();
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    @Override
    public List visualizarCarrinho(){
        return this.carrinhoCompras.visualizarCarrinho();
    }

    @Override
    public boolean adicionarItemCarrinho(Produto produto) {
        return this.carrinhoCompras.adicionarItem(produto);
    }

    @Override
    public boolean removerItemCarrinho(Produto produto) {
        return this.carrinhoCompras.removerItem(produto);
    }

    @Override
    public boolean finalizarCompra() {
        return this.carrinhoCompras.finalizarCompra();
    }
    
}
