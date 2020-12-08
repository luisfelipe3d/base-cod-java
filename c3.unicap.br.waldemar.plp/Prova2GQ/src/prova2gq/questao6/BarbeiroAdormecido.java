/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2gq.questao6;

import java.util.concurrent.Semaphore;

/**
 *
 * @author home
 */
public class BarbeiroAdormecido {
    public static Semaphore clientes = new Semaphore(0);
    public static Semaphore barbeiro = new Semaphore(0);
    public static Semaphore assentos = new Semaphore(1);
    public static final int CADEIRAS = 5;
    public static int assentosDisponiveis = CADEIRAS;
    
}
