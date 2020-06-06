/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.controller;

import mercado.Interface.IUsuarioAdministrador;
import mercado.model.UsuarioAdministrador;
import mercado.model.repositorio.RepositorioAdministrador;


/**
 *
 * @author home
 */
public class ControladorAdministrador {
    private IUsuarioAdministrador repoAdmin;
    
    public ControladorAdministrador(){
        this.repoAdmin = new RepositorioAdministrador();
    }
    
    public boolean cadastro(UsuarioAdministrador User){
        return this.repoAdmin.cadastro(User);
    }
    
    public void cadastrarProduto(){
        
    }
    public void alterarProduto(){
        
    }
    public void removerProduto(){
        
    }
    
    public boolean login(UsuarioAdministrador User){
        return this.repoAdmin.login(User);
    }
}
