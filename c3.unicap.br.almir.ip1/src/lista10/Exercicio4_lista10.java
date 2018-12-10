/*
Exercicio:
Faça um programa para fazer conversão de um tempo expresso em horas e minutos  
para um tempo expresso apenas em minutos e vice-versa. 
O programa deverá apresentar os seguintes subprogramas: 
a)Função para converter um tempo expresso em horas e minutos para um tempo 
expresso apenas em minutos. Esta função receberá como parâmetro o tempo expresso 
em horas e minutos a ser convertido e deverá calcular e retornar para o programa 
o valor correspondente do tempo em minutos. O programa se encarregará de exibir 
o resultado ao usuário.  
b)Procedimento para converter um tempo expresso em minutos para um tempo 
expresso em horas e minutos. Este procedimento receberá como parâmetro o tempo 
expresso em minutos a ser convertido e deverá calcular e exibir o tempo 
correspondente expresso em horas e minutos. 
OBS.1: Toda entrada de dados deve ser feita pelo programa principal. 
OBS.2:  O  programa  deverá  ter  um  menu  principal  que  permita  ao  usuário
executar  os  subprogramas quantas vezes desejar e só deverá terminar sua 
execução se o usuário solicitar. 
*/
package lista10;
import java.util.Scanner;

public class Exercicio4_lista10 {
    static void linha(){
        for(int i = 1; i<=25 ; i++)
            System.out.print("*");
        System.out.println("");
    }
    
    static int horaMin(int horas, int minutos){
        return (horas*60) + minutos;
    }
    
    static void minHora(int minutos){
        int out_horas,out_minutos;
        out_horas = minutos/60;
        out_minutos = minutos - out_horas*60;
        System.out.println("Horas: "+out_horas);
        System.out.println("Minutos: "+out_minutos);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int op,horas,minutos;
        
        do{
            linha();
            System.out.println("Programa 4");
            System.out.println("1. Horas e minutos para minutos");
            System.out.println("2. Minutos para horas e minutos");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            op = in.nextInt();
            linha();
            
            switch(op){
                case 1:
                    System.out.print("Horas: ");
                    horas = in.nextInt();
                    System.out.print("Minutos: ");
                    minutos = in.nextInt();
                    System.out.println(horaMin(horas,minutos)+" Minutos. ");
                    break;
                case 2:
                    System.out.print("Minutos: ");
                    minutos = in.nextInt();
                    minHora(minutos);
                    break;
                case 3:
                    System.out.println("Fim do Programa");
                    linha();
            }
        }while (op != 3);
    }
}
