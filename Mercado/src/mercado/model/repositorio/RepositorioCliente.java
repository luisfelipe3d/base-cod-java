package mercado.model.repositorio;

import java.util.ArrayList;
import java.util.List;
import mercado.Interface.IUsuarioCliente;
import mercado.model.UsuarioCliente;

public class RepositorioCliente implements IUsuarioCliente{
    private List<UsuarioCliente> listaClientes = new ArrayList();
    
    @Override
    public boolean cadastrar(UsuarioCliente cliente) {
        if(this.buscar(cliente)){
            return false;
        }
        return this.listaClientes.add(cliente);
    }

    @Override
    public boolean remover(UsuarioCliente cliente) {
        if(!this.buscar(cliente)){
            return false;
        }
        return this.listaClientes.remove(cliente);        
    }
    
    @Override
    public boolean buscar(UsuarioCliente cliente){
        return this.listaClientes.contains(cliente);
    }
    
}
