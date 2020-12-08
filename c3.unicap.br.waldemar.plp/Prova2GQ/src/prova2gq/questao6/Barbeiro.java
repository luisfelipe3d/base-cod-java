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
public class Barbeiro extends Thread {
    
    public Barbeiro() {
    
    }

    @Override
    public void run() {
        while (true) { 
            try {
                clientes.acquire();
                assentos.release(); 
                assentosDisponiveis++;
                barbeiro.release(); 
                assentos.release(); 
                this.cortaCabelo();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public void cortaCabelo() {
        System.out.println("O barbeiro está cortando cabelo");
        try {
            sleep(5000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}    

