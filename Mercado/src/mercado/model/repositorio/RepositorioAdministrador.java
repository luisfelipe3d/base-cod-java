/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.model.repositorio;

import java.util.ArrayList;
import java.util.List;
import mercado.Interface.IUsuarioAdministrador;
import mercado.model.UsuarioAdministrador;

/**
 *
 * @author home
 */
public class RepositorioAdministrador implements IUsuarioAdministrador {

    private List<UsuarioAdministrador> userAdm;

    public RepositorioAdministrador() {
        this.userAdm = new ArrayList();
    }
   
    
    @Override
    public void cadastrarProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login(UsuarioAdministrador User) {
        return false;
    }

    @Override
    public boolean cadastroAdmin(UsuarioAdministrador User) {
        if(this.userAdm.contains(User)){
            return false;//TODO adc Expection
        }
        this.userAdm.add(User);
        return true;
    }
    

    @Override
    public void listar() {
        this.userAdm.forEach(e -> e.toString());
    }
    
}
