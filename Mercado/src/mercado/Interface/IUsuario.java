/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.Interface;

import mercado.model.Usuario;

/**
 *
 * @author home
 */
public interface IUsuario {
    public <T extends Usuario> boolean login(T User);
}
