package mercado.Interface;

import java.util.List;
import mercado.model.Produto;

public interface IProduto {
    public boolean cadastrarProduto(Produto produto);

    public boolean alterarQuantidade(Produto produto, int quantidade);

    public List listarProdutos();
    
    public boolean removerProduto(Produto produto);
    
    public boolean buscarProduto(Produto produto);
}
