package mercado.controller;

import mercado.Interface.IUsuarioAdministrador;
import mercado.model.UsuarioAdministrador;
import mercado.model.repositorio.RepositorioAdministrador;

public class ControladorAdministrador {
    private IUsuarioAdministrador repoAdmin;
    
    public ControladorAdministrador(){
        this.repoAdmin = new RepositorioAdministrador();
    }
    
    public boolean cadastro(UsuarioAdministrador User){
        return this.repoAdmin.cadastro(User);
    }
    
    public boolean login(String CPF, String senha){
        return this.repoAdmin.login(CPF, senha);
    }
}
