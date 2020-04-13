/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha1;

import java.io.Serializable;
import javafx.scene.control.Button;

/**
 *
 * @author home
 */
public class Jogo implements Serializable {
    
    private Jogador p1;
    private Jogador p2;
    private int rodadas;
    private boolean ePrimeiroJogador;
    
    public Jogo(){
        this.p1 = new Jogador("Jogador 1");
        this.p2 = new Jogador("Jogador 2");
        this.rodadas = 0;
    }
    
    public Jogo(Jogador p1, Jogador p2){
        this.p1 = p1;
        this.p2 = p2;
        this.rodadas = 0;
    }
    
    public Jogador getP1() {
        return p1;
    }

    public void setP1(Jogador p1) {
        this.p1 = p1;
    }

    public Jogador getP2() {
        return p2;
    }

    public void setP2(Jogador p2) {
        this.p2 = p2;
    }

    public int getRodadas() {
        return rodadas;
    }

    public void addRodada() {
        this.rodadas = this.rodadas + 1;
    }

    public boolean getPrimeiroJogador() {
        return ePrimeiroJogador;
    }
    
    public Boolean defineJogador(Jogador p1, Jogador p2){
        int random = (int) (Math.random() * 20) + 1; 
        if(random%2 == 0){
            return this.ePrimeiroJogador = true;    
        }else{
            return this.ePrimeiroJogador = false;
        }
   
    }
   
    
}
