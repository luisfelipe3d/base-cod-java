/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha1;

import java.io.Serializable;

/**
 *
 * @author home
 */
public class Jogo implements Serializable {
    
    private Jogador p1;
    private Jogador p2;
    private int rodadas;
    private boolean ePrimeiroJogador;
    private int [][] matriz;
    //jogador 1 = O e -3
    //jogador 2 = X e 3
    public Jogo(){
        this.p1 = new Jogador("Jogador 1");
        this.p2 = new Jogador("Jogador 2");
        this.rodadas = 0;
        //this.matriz = new int [3][3];
    }
    
    public Jogo(Jogador p1, Jogador p2){
        this.p1 = p1;
        this.p2 = p2;
        this.rodadas = 0;
    }
    
    public Jogador getP1() {
        return p1;
    }

    

    public Jogador getP2() {
        return p2;
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
    
    public void defineJogador(Jogador p1, Jogador p2){
        int random = (int) (Math.random() * 20) + 1; 
        if(random%2 == 0){
            this.ePrimeiroJogador = true;    
        }else{
            this.ePrimeiroJogador = false;
        }
        this.matriz = new int [3][3];
    }
    
    public void Jogada(int linha, int coluna){
        if(this.ePrimeiroJogador){
            this.matriz[linha][coluna] = 1;
            this.ePrimeiroJogador = false;
        }else{
            this.matriz[linha][coluna] = -1;
            this.ePrimeiroJogador = true;
        }
        verificaVencedor();
        this.rodadas = this.rodadas + 1;
    }
    
    public int verificaVencedor(){
        //Retorna jogador 1 = 1; jogador 2 = 2; velha = 3; continua = 4;
        int soma = 0, soma2 = 0, linha, coluna;
        int d1 = this.matriz[0][0] + this.matriz[1][1] + this.matriz[2][2];
        int d2 = this.matriz[0][2] + this.matriz[1][1] + this.matriz[2][0];
        //Diagonal
        if(d1 == -3 || d2 == -3){
            System.out.println(this.p1.getPontuacao());
            this.p1.addPontuacao();
            System.out.println(this.p1.getPontuacao());
            //System.out.println("Jogador 1 venceu - Diagonal\n");
            this.rodadas = 0;
            //limparMatriz();
            return 1;
        }else if(d1 == 3|| d2 == 3){
            this.p2.addPontuacao();
            //System.out.println("Jogador 2 venceu - Diagonal\n");
            this.rodadas = 0;
            //limparMatriz();
            return 2;
        }
        //verifica linha e coluna
        for(linha = 0; linha < this.matriz.length ; linha = linha + 1){
            for(coluna = 0; coluna < this.matriz.length; coluna = coluna + 1){
                soma = soma + this.matriz[linha][coluna];
                soma2 = soma2 + this.matriz[coluna][linha];
                if(soma == 3 || soma2 == 3){
                    this.p1.addPontuacao();
                    //System.out.println("Jogador 1 venceu - Linha\n");
                    this.rodadas = 0;
                    //limparMatriz();
                    return 1; 
                }else if(soma == -3 || soma2 == -3){
                    this.p2.addPontuacao();
                    //System.out.println("Jogador 2 venceu - Linha\n");
                    this.rodadas = 0;
                    //limparMatriz();
                    return 2;
                }
            }
            soma = 0;
            soma2 = 0;
            
        }
        //Condição de empate 
        if(this.rodadas == 9){
            this.rodadas = 0;
            //limparMatriz();
            return 3;
        }
        
        return 4;  
    }
    
    public void limparMatriz(){
        this.matriz = new int [3][3];
    }
   
    
}
