/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.model;

import mercado.Interface.IUsuarioCliente;

/**
 *
 * @author home
 */
public class UsuarioCliente  extends Usuario implements IUsuarioCliente {
    
    public UsuarioCliente(String CPF, String nome, String telefone, String senha) {
        super(CPF, nome, telefone, senha);
    }

    @Override
    public boolean cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
