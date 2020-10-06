/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3.unicap.br.monitoria.ed1.aplicacao.lista1.lde.tarefa;

import java.util.Objects;

/**
 *
 * @author home
 */
public class Tarefa implements Comparable<Tarefa> {
    private String descricao;
    private int prioridade;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "descricao=" + descricao + ", prioridade=" + prioridade + '}';
    }

    @Override
    public int compareTo(Tarefa t) {
        if(this.prioridade < t.prioridade){
            return -1;
        } else if(this.prioridade > t.prioridade){
            return 1;
        } else {
            return 0;
        }
    }

    
    public boolean equals(Tarefa t) {
        return this.descricao.equalsIgnoreCase(t.getDescricao());
    }
    
    
}
