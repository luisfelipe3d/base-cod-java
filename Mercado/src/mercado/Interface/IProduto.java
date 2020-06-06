package mercado.Interface;

import java.util.List;
import mercado.model.Produto;

public interface IProduto {
    public boolean cadastrarProduto(Produto p);

    public void reabastecerEstoque();

    public void listarProdutos();

    public List<Produto> getProdutos();
}
