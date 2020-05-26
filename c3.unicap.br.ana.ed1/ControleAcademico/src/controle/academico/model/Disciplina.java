/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.model;

import java.io.Serializable;

/**
 *
 * @author home
 */
public class Disciplina implements Serializable {
    private String cod_disc;
    private String nome;
    private int carga;
    private int creditos;
    private char periodo;

    public Disciplina(String cod_disc, String nome, int carga, int creditos, char periodo) {
        this.cod_disc = cod_disc;
        this.nome = nome;
        this.carga = carga;
        this.creditos = creditos;
        this.periodo = periodo;
    }

    public String getCod_disc() {
        return cod_disc;
    }

    public void setCod_disc(String cod_disc) {
        this.cod_disc = cod_disc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public char getPeriodo() {
        return periodo;
    }

    public void setPeriodo(char periodo) {
        this.periodo = periodo;
    }
    
    
    
}
