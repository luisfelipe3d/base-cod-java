/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha1;

import java.io.Serializable;

/**
 *
 * @author home
 */
public class Jogador implements Serializable {
    private String nome;
    private int pontuacao;

    public Jogador(){
        this.nome = "";
        this.pontuacao = 0;
    }
    
    public Jogador(String nome){
        this.nome = nome;
        this.pontuacao = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void addPontuacao() {
        this.pontuacao = this.pontuacao + 1;
    }

    @Override
    public String toString() {
        return this.nome + " : " + this.pontuacao;
    }
    
}
