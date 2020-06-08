package mercado.Interface;

import java.util.List;
import mercado.model.Produto;

public interface IProduto {
    public boolean cadastrarProduto(Produto produto);

    public boolean alterarQuantidade(int codigo, int quantidade);

    public List listarProdutos();
    
    public boolean removerProduto(int codigo);
    
    public int buscarProduto(int codigo);
    
    public Produto retornarProduto(int codigo);
}
