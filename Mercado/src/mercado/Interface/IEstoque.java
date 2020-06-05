/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.Interface;

import java.util.List;
import mercado.model.Produto;

/**
 *
 * @author home
 */
public interface IEstoque {
    public boolean cadastrarProduto(Produto p);

    public void reabastecerEstoque();

    public void listarProdutos();

    public List<Produto> getProdutos();
}
