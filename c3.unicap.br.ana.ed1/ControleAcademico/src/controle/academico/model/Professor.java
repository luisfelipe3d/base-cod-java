/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.model;

import java.time.LocalDate;

/**
 * Cria um objeto Professor
 * @author home
 */
public class Professor extends Pessoa {

    public Professor(String cpf, String nome, LocalDate dataNascimento, 
            String sexo, String telefone, String email, Endereco endereco) {
        super(cpf, nome, dataNascimento, sexo, telefone, email, endereco);
    }

    public Professor(String cpf) {
        super(cpf);
    }

        @Override
    public String toString() {
        return "Professor{cpf=" + this.cpf + ",nome=" + this.nome + 
                ",dataNascimento=" + this.dataNascimento
                + ",sexo=" + this.sexo + "\n,telefone=" + this.telefone +
                ",email=" + this.email + ",endereço=" + this.endereco;
    }
    
}
