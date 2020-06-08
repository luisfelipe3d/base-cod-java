package mercado.model.repositorio;

import java.util.ArrayList;
import java.util.List;
import mercado.Interface.IUsuarioAdministrador;
import mercado.model.UsuarioAdministrador;

public class RepositorioAdministrador implements IUsuarioAdministrador {

    private List<UsuarioAdministrador> userAdm = new ArrayList<>();
    
    @Override
    public boolean login(String cpf, String senha) {
        for(int i = 0; i < this.userAdm.size(); i++){
            if(this.userAdm.get(i).getCPF().equalsIgnoreCase(cpf) && this.userAdm.get(i).getSenha().equalsIgnoreCase(senha)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cadastro(UsuarioAdministrador User) {
        if(this.userAdm.contains(User)){
            return false;
        }
        this.userAdm.add(User);
        return true;
    }
    
}
