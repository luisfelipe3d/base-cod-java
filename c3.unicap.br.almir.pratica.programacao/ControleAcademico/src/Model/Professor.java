/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Pessoa;

/**
 *
 * @author home
 */
public class Professor extends Pessoa {

    public Professor(String cpf, String nome, String dataNascimento, 
            boolean eHomem, String telefone, String email, Endereco endereco) {
        super(cpf, nome, dataNascimento, eHomem, telefone, email, endereco);
    }

    
}
