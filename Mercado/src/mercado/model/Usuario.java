/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.model;

/**
 *
 * @author home
 */
public abstract class Usuario {
    
    protected String CPF;
    protected String nome;
    protected String telefone;
    protected String usuario;
    protected String senha;

    public Usuario(String CPF, String nome, String telefone, String login, String senha) {
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
        this.usuario = login;
        this.senha = senha;
    }
    
    public Usuario(String nome, String usuario, String senha){
        this.nome = nome;
        this.usuario = usuario;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
