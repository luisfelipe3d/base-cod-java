package mercado.Interface;

import mercado.model.UsuarioCliente;

public interface IUsuarioCliente {
    
    public boolean cadastrar(UsuarioCliente cliente);
    
    public boolean remover(String CPF);
    
    public int buscar(String CPF);
    
    public boolean login(String CPF, String senha);
    
}
