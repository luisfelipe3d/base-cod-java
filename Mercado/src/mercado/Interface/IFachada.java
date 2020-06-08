package mercado.Interface;

import java.util.List;
import mercado.model.Produto;
import mercado.model.UsuarioAdministrador;
import mercado.model.UsuarioCliente;

public interface IFachada {
    public boolean cadastrarCliente(UsuarioCliente cliente);
    
    public boolean removerCliente(String CPF);
    
    public boolean loginCliente(String CPF, String senha);
    
    public boolean cadastarAdministrador(UsuarioAdministrador administrador);
    
    public boolean loginAdministrador(String CPF, String senha);
    
    public boolean cadastrarProdutos(Produto produto);
    
    public boolean alterarQuantidade(int codigo, int quantidade);
    
    public List visualizarProdutos();
    
    public boolean removerProduto(int codigo);
    
    public boolean adicionarProdutoCarrinho(int codigo);
    
    public boolean removerItemCarrinho(int codigo);
    
    public boolean cadastrarProduto(Produto produto);
    
    public List visualizarCarrinho();
    
    public boolean finalizarCompra();
    
    public boolean aplicarDescontoAleatorio();
    
    
    
}
