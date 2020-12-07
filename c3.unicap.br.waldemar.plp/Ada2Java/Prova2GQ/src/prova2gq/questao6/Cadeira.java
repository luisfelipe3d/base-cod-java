/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2gq.questao6;

/**
 *
 * @author home
 */
public class Cadeira {
    private boolean isOcupada;

    public Cadeira() {
        this.isOcupada = false;
    }
    
    public boolean mudarEstado(){
        return !isOcupada;
    }
    
    public boolean getEstado(){
        return this.isOcupada;
    }
    
}
