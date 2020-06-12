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
    private String codDisciplina;
    private String nome;
    private int carga;
    private int creditos;
    private String periodo;

    public Disciplina(String codDisciplina, String nome, int carga, int creditos, String periodo) {
        this.codDisciplina = codDisciplina;
        this.nome = nome;
        this.carga = carga;
        this.creditos = creditos;
        this.periodo = periodo;
    }

    public String getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(String codDisciplina) {
        this.codDisciplina = codDisciplina;
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
    
}
