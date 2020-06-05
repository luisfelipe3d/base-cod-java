/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.model;

import mercado.Interface.IUsuarioAdministrador;

/**
 *
 * @author home
 */
public class UsuarioAdministrador extends Usuario implements IUsuarioAdministrador {
    
    public UsuarioAdministrador(String nome, String usuario, String senha) {
        super(nome, usuario, senha);
    }

    @Override
    public <T extends Usuario> boolean login(T User) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrarProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
