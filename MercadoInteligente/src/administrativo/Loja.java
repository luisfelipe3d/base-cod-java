package administrativo;

import estoque.*;

//Classe implementada por João Thalis
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Loja {

    private String CNPJ;
    private String nome;
    private String endereco;
    private List<Usuario> usuarios;
    private Estoque estoque;

    public Loja(String CNPJ, String nome, String endereco) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.endereco = endereco;
        this.usuarios = new ArrayList<Usuario>();
        this.estoque = new Estoque();
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public Usuario validarLogin(String login, String senha) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);

            if (usuario.getLogin().compareTo(login) == 0 && usuario.getSenha().compareTo(senha) == 0) {
                return usuario;
            }
        }

        return null;
    }

}
