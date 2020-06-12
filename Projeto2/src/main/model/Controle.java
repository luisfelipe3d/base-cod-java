/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author home
 */
public class Controle implements IControle {
    
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    @Override
    public <T extends Pessoa> boolean cadastrar(T obj) {
        Aluno tmp;
        Professor aux;
        if(obj instanceof Aluno){
            tmp = (Aluno) obj;
            if(buscar(obj.getCpf()) == null){
                this.alunos.add(tmp);
                return true;
            }
        }else if(obj instanceof Professor){
            aux = (Professor) obj;
            if(buscar(obj.getCpf()) == null){
                this.professores.add(aux);
                return true;
            }
        }
        return false;
    }

    @Override
    public void alterar(String cpf) {
        
    }

    @Override
    public List exibir(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T extends Pessoa> boolean remover(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listarTodos(List l) {
        if(l.isEmpty()){
            return null;
        }
        return l;
    }

    @Override
    public <T extends Pessoa> T buscar(String cpf) {
        int i;
        boolean existe;
        Aluno tmp;
        Professor aux;
        if(this.alunos.isEmpty()){
            return null;
        }else if(this.professores.isEmpty()){
            return null;
        }
        tmp = new Aluno(cpf);
        for(i = 0 ; i < this.alunos.size(); i++){
            existe = this.alunos.get(i).equals(tmp);
            if(existe){
                return (T) tmp;
            }
        }
        aux = new Professor(cpf);
        for(i = 0; i < this.professores.size(); i++){
            existe = this.professores.get(i).equals(aux);
            if(existe){
                return (T) aux;
            }
        }
        return null;
    }
}
