package mercado.Interface;

import mercado.model.UsuarioCliente;

public interface IUsuarioCliente {
    
    public boolean cadastrar(UsuarioCliente cliente);
    
    public boolean remover(UsuarioCliente cliente);
    
    public boolean buscar(UsuarioCliente cliente);
    
}
