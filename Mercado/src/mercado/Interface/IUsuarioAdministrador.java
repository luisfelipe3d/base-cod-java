package mercado.Interface;

import mercado.model.UsuarioAdministrador;

public interface IUsuarioAdministrador {
    public boolean login(String cpf, String senha);
    public boolean cadastro(UsuarioAdministrador User);
}
