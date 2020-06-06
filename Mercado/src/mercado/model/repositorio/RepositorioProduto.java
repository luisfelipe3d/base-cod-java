package mercado.model.repositorio;

import java.util.ArrayList;
import java.util.List;
import mercado.model.Produto;
import mercado.Interface.IProduto;

public class RepositorioProduto implements IProduto {
    protected List<Produto> listaProdutos = new ArrayList();

    @Override
    public boolean cadastrarProduto(Produto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reabastecerEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> getProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
