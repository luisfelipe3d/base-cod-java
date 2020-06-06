package mercado.Interface;

import java.util.List;
import mercado.model.Produto;
import mercado.model.UsuarioCliente;

public interface IFachada {
    public boolean cadastrarCliente(UsuarioCliente cliente);
    
    public boolean removerCliente(UsuarioCliente cliente);
    
    public boolean cadastarAdministrador();
    
    public boolean cadastrarProdutos(Produto produto);
    
    public boolean alterarQuantidade(Produto produto, int quantidade);
    
    public List visualizarProdutos();
    
    public boolean removerProduto(Produto produto);
    
    
    
}
