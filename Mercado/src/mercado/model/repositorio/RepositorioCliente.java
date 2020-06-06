package mercado.model.repositorio;

import java.util.ArrayList;
import java.util.List;
import mercado.Interface.IUsuarioCliente;
import mercado.model.UsuarioCliente;

public class RepositorioCliente implements IUsuarioCliente{
    private List<UsuarioCliente> lista = new ArrayList();
    
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
