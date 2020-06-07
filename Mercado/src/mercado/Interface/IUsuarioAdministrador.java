/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.Interface;

import mercado.model.UsuarioAdministrador;

/**
 *
 * @author home
 */
public interface IUsuarioAdministrador {
    public boolean login(String cpf, String senha);
    public void cadastrarProduto();
    public void alterarEstoque();
    public void removerProduto();
    public boolean cadastro(UsuarioAdministrador User);
}
