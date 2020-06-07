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
    
    public boolean remover(String CPF){
        return this.repositorioCliente.remover(CPF);
    }
    
    public boolean login(String CPF, String senha){
        return this.repositorioCliente.login(CPF, senha);
    }
    
}
