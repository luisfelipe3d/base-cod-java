package administrativo;

//Classe implementada por João Thalis
public class Administrador extends Usuario {

    private String senhaAdm;

    public Administrador(String CPF, String nome, String telefone, String login, String senha, String senhaAdm) {
        super(CPF, nome, telefone, login, senha);
        this.senhaAdm = senhaAdm;
    }

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }

}
