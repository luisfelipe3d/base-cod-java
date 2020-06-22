package mercado.model;

import mercado.Interface.IObserver;
import mercado.Interface.ISubject;

public class UsuarioCliente extends Usuario implements IObserver{
        ISubject subject;
    
    public UsuarioCliente(String CPF, String nome, String telefone, String senha, Produto produto) {
        super(CPF, nome, telefone, senha);
        this.subject = produto;
    }

    @Override
    public void update(ISubject updatedSubject) {
        this.subject = updatedSubject;
    }
    
}
