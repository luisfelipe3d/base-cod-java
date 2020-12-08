/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2gq.questao6;

import static prova2gq.questao6.BarbeiroAdormecido.*;
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
            try {
                assentos.acquire();  
                if (assentosDisponiveis > 0) { 
                    System.out.println("Cliente" + this.id + " está sentado.");
                    assentosDisponiveis--; 
                    clientes.release(); 
                    assentos.release(); 
                    try {
                        barbeiro.acquire();
                        isCut = false;
                        this.cortaCabelo();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();   
                    }
                } else { 
                    System.out.println("Sem cadeiras disponíveis " + this.id + 
                            " saiu da barbearia.");
                    assentos.release();  
                    this.isCut = false;
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void cortaCabelo() {
        System.out.println("Cliente" + this.id + " está cortando o cabelo.");
        try {
            sleep(5050);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
