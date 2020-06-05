package administrativo;

public abstract class Usuario {

    protected String CPF;
    protected String nome;
    protected String telefone;
    protected String login;
    protected String senha;

    public Usuario(String CPF, String nome, String telefone, String login, String senha) {
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
