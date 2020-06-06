package mercado.model;

import mercado.Interface.IUsuarioAdministrador;

public class UsuarioAdministrador extends Usuario implements IUsuarioAdministrador {
    
    public UsuarioAdministrador(String CPF, String nome, String usuario, String senha) {
        super(CPF, nome, usuario, senha);
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

    @Override
    public void removerProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
