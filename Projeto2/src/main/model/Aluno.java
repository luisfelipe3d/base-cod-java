/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author home
 */
public class Aluno extends Pessoa implements Serializable {
    
    public Aluno(String cpf) {
        super(cpf);
    }
    
    public Aluno(String cpf, String nome, LocalDate dataNascimento, String sexo,
            String telefone, String email, Endereco endereco) {
        super(cpf, nome, dataNascimento, sexo, telefone, email, endereco);
    }
        
    
}
