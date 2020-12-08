/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2gq.questao6;

import static java.lang.Thread.sleep;

/**
 *
 * @author home
 */
public class Aplicacao {
    public static void main(String[] args) {
        Barbeiro barbearia = new Barbeiro();  
        barbearia.start();
  }

    public void run() {
        Barbeiro felipe = new Barbeiro();
        felipe.start();

        for (int i = 1; i < 16; i++) {
            Cliente cliente = new Cliente(i);
            cliente.start();
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            };
        }
    }

}

