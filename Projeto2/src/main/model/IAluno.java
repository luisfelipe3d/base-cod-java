/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

import java.util.List;

/**
 *
 * @author home
 */
public interface IAluno {
    
    public <T extends Pessoa> boolean cadastrar(T obj);
    
    public void alterar(String cpf);
    
    public List exibir(String cpf);
    
    public <T extends Pessoa> boolean remover(String cpf);
    
    public List listarTodos(List l);
    
    public <T extends Pessoa> T buscar(String cpf);
}
