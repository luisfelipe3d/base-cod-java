/*
TODO VALIDAÇÃO DOS CAMPOS
https://www.tutorialspoint.com/java/java_regular_expressions.htm
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author home
 */
public abstract class Pessoa implements Serializable {
    
    protected final String cpf;
    protected String nome;
    protected String dataNascimento;
    protected boolean eHomem;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    public Pessoa(String cpf){
        this.cpf = cpf;
    }
    public Pessoa(String cpf, String nome, String dataNascimento, 
            boolean eHomem, String telefone, String email, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.eHomem = eHomem;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean iseHomem() {
        return eHomem;
    }

    public void seteHomem(boolean eHomem) {
        this.eHomem = eHomem;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
}
