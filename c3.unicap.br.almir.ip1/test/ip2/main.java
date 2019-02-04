/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetApar = new int [50];
        int[] vetBimpar = new int [vetApar.length];
        int op,novoNum;
        int indexPar=0,indexImpar=0;
        
        do{
            System.out.println("****Menu****");
            System.out.println("1 - Armazenar número");
            System.out.println("2 - Procurar número");
            System.out.println("3 - Exibir números pares");
            System.out.println("4 - Exibir números ímpares");
            System.out.println("5 - Remover número");
            System.out.println("6 - Encerrar programa");
            System.out.print("Opção: ");
            op = in.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Armazenar número: ");
                    System.out.print("Num: ");
                    novoNum = in.nextInt();
                    if (isPar(novoNum)){
                        verificaNum(vetApar,indexPar,novoNum);
                        indexPar = insertNum(vetApar,indexPar,novoNum);
                    }
                    else{
                        verificaNum(vetBimpar,indexImpar,novoNum);
                        indexImpar = insertNum(vetBimpar,indexImpar,novoNum);
                    }
                    break;
                case 2:
                    System.out.println("Procurar número: ");
                    System.out.print("Num: ");
                    novoNum = in.nextInt();
                    if (isPar(novoNum)){
                        int aux = buscaValor(vetApar,indexPar,novoNum);
                        System.out.println("Valor: "+aux);
                    }else{
                        int aux = buscaValor(vetBimpar,indexImpar,novoNum);
                        System.out.println("Valor: "+aux);
                    }
                    
                    break;
                case 3:
                    System.out.println("Exibir números pares: ");
                    showPares(vetApar,indexPar);
                    break; 
                case 4:
                    System.out.println("Exibir números ímpares: ");
                    showImpares(vetBimpar,indexImpar);
                    break;
                case 5:
                    System.out.println("Remover número: ");
                    System.out.print("Num: ");
                    novoNum = in.nextInt();
                    if (isPar(novoNum)){
                        int aux = removeValor(vetApar,indexPar,novoNum);
                        System.out.println("Valor: "+vetBimpar[aux]+" removido");
                    }else{
                        int aux = removeValor(vetBimpar,indexImpar,novoNum);
                        System.out.println("Valor: "+vetBimpar[aux]+" removido");
                    }
                    break;
                case 6:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida");
            } // fim switch
            
        } while (op != 6);
    } // end psvm
    
        static void verificaNum(int[] vetQ, int indexQ, int num){
        //verifica se o vetor está completo    
        if (indexQ < vetQ.length){
        //compara o número digitado com os números dentro do vetor        
            for (int i = 0; i < indexQ; i++){
                                
                if (vetQ[i] == num){
                    System.out.printf("Este número %d foi "
                    + "adicionado anteriormente\n",num);
                    break;   
                } 
            } // end for
  
            System.out.println("Valor inserido."); 
        }else
            System.out.println("Vetor cheio.");
    }
    
    static int insertNum(int[] vetX, int qtdPreenchido, int valor){
        vetX[qtdPreenchido] = valor;
        qtdPreenchido++;
        return qtdPreenchido;
    }
    
    static boolean isPar(int num){
        return num % 2 == 0;
    }
    
    static void showPares(int[] vetP, int qtdPreenchido){
        System.out.print("Vetor par: ");
        for (int i = 0; i < qtdPreenchido; i++){
            System.out.print(vetP[i]+", ");
        }
        System.out.println("");
    }
    
    static void showImpares(int[] vetI, int qtdPreenchido){
        System.out.print("Vetor Impares: ");
        for (int i = 0; i < qtdPreenchido; i++){
            System.out.print(vetI[i]+", ");
        }
        System.out.println("");
    }
    
    static int buscaValor(int[] vetX, int indexQ, int valor){
        for (int i = 0; i < indexQ; i++){
            if (vetX[i] == valor)
                return i;
        }
        return -1;
    }
    
    static int removeValor(int[] vetX, int indexQ, int valor){
        int aux = buscaValor(vetX,indexQ,valor);
        if(aux != -1){
            return vetX[aux] = 0; 
        }
        return -1;
    }
}

