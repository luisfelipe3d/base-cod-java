/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.model;

/**
 *
 * @author home
 */
public class UsuarioSistema {
    private  String nome;
    private  String login;
    private  String senha;
    private  String senha2;
    //Nome de usuário, E-mail ou CPF, senha e senha2
    public UsuarioSistema(String nome,String login, String senha,String senha2) {
        if(login.isEmpty() || senha.isEmpty() || nome.isEmpty() || senha2.isEmpty()){
            //LOGIN OU SENHA VAZIA
        }
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.senha2 = senha2;
    }
    
    private Boolean validaTexto(String nome){
        return nome.matches("[A-Z][a-z]{1,}");
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getSenha2() {
        return senha2;
    }
    
    
}
