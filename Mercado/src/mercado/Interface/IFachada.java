package mercado.Interface;

import java.util.List;
import mercado.model.Produto;
import mercado.model.UsuarioCliente;

public interface IFachada {
    public boolean cadastrarCliente(UsuarioCliente cliente);
    
    public boolean removerCliente(String CPF);
    
    public boolean loginCliente(String CPF, String senha);
    
    public boolean cadastarAdministrador();
    
    public boolean cadastrarProdutos(Produto produto);
    
    public boolean alterarQuantidade(int codigo, int quantidade);
    
    public List visualizarProdutos();
    
    public boolean removerProduto(int codigo);
    
    
    
}
