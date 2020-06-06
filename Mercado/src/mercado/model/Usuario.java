package mercado.model;

public abstract class Usuario {    
    protected String CPF;
    protected String nome;
    protected String telefone;
    protected String senha;

    public Usuario(String CPF, String nome, String telefone, String senha) {
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
