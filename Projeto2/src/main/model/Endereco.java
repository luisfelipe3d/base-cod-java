/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

import java.io.Serializable;

/**
 *
 * @author home
 */
public class Endereco implements Serializable{
    
    private String estado;
    private String cidade;
    private String rua;
    private String numero;
    private String cep;
    private String complemento;

    public Endereco(String estado, String cidade, String rua, String numero, String cep, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" + "estado=" + estado + ", cidade=" + cidade + ", rua=" + rua + ", numero=" + numero + ", cep=" + cep + ", complemento=" + complemento + '}';
    }
    
}
