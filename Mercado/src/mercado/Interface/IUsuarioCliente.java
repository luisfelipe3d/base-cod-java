package mercado.Interface;

import java.util.List;
import mercado.model.Produto;
import mercado.model.UsuarioCliente;

public interface IUsuarioCliente {
    
    public boolean cadastrar(UsuarioCliente cliente);
    
    public boolean remover(String CPF);
    
    public int buscar(String CPF);
    
    public boolean login(String CPF, String senha);
    
    public List visualizarCarrinho();
    
    public boolean adicionarItemCarrinho(Produto produto);
    
    public boolean removerItemCarrinho(Produto produto);
    
    public boolean finalizarCompra();
    
}
