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
public class Cliente extends Thread {
    private int id;
    private boolean isCut;

    public Cliente(int id) {
        this.id = id;
        this.isCut = false;
    }
    
    @Override
    public void run(){
        while(!isCut){

        }
    }
}
