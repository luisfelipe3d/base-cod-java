package mercado.controller;

import mercado.Interface.IUsuarioCliente;
import mercado.model.UsuarioCliente;
import mercado.model.repositorio.RepositorioCliente;

public class ControladorCliente {
    private IUsuarioCliente repositorioCliente;
    
    public ControladorCliente(){
        this.repositorioCliente = new RepositorioCliente();
    }
    
    public boolean cadastrar(UsuarioCliente cliente){
        return this.repositorioCliente.cadastrar(cliente);
    }
    
    public boolean remover(UsuarioCliente cliente){
        return this.repositorioCliente.remover(cliente);
    }
    
}
