/*
Implemente um programa para computar o resultado de uma eleição. Existem 
quatro candidatos concorrendo (João, Maria, Pedro e Luís). Ao votar, o eleitor
terá as seguintes opções:
0 – Voto em branco
1 – Voto em João
2 – Voto em Maria
3 – Voto em Pedro
4 – Voto em Luís
Como não sabemos quantas pessoas irão votar, um voto igual a 9 encerra a 
eleição. Qualquer voto diferente dos valores citados, deve ser computado como
nulo. Ao encerrar a votação, o programa deverá informar qual o candidato mais 
votado (excetuando-se os votos brancos e nulos) e o percentual de votos de cada
candidato, bem como o percentual de brancos e de nulos. O programador deverá 
declarar subprogramas para realizar os cálculos solicitados.
 */
package ip2.lista2;
import java.util.Scanner;
/**
 *
 * @author luisfelipe3d
 */
public class q1_lista2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] votos = new int [5];
        int qtd_nulos=0,total_votos=0;
        int op;
        //menu
        do{
            System.out.println("Eleições 2020: ");
            System.out.println("0 - Vota em Branco");
            System.out.println("1 - Vota em João");
            System.out.println("2 - Vota em Maria");
            System.out.println("3 - Vota em Pedro");
            System.out.println("4 - Vota em Luís");
            System.out.println("9 - Encerra votação");
            System.out.print("Opção: ");
            op = in.nextInt();
            switch(op){
                case 0:
                    votos[0] += 1;
                    total_votos++;
                    break;
                case 1:
                    votos[1] += 1;
                    total_votos++;
                    break;
                case 2:
                    votos[2] += 1;
                    total_votos++;
                    break;
                case 3:
                    votos[3] += 1;
                    total_votos++;
                    break;
                case 4:
                    votos[4] += 1;
                    total_votos++;
                    break;
                case 9:
                    System.out.println("Fim da votação.");
                    System.out.println("");
                    break;
                default:
                    qtd_nulos++;
                    total_votos++;
            }
            
        } while (op != 9);
        //saida
        maisVotado(votos);
        System.out.println("Brancos e nulos: "+(returnBrancos(votos)+qtd_nulos));
        System.out.printf("Votos João: %.2f%% \n",percJoao(votos,total_votos));
        System.out.printf("Votos Maria: %.2f%% \n",percMaria(votos,total_votos));
        System.out.printf("Votos Pedro: %.2f%% \n",percPedro(votos,total_votos));
        System.out.printf("Votos Luis: %.2f%% \n",percLuis(votos,total_votos));
        System.out.println("Total de votos: "+total_votos);
        //mostra valores dos vetores
        showVetor(votos);

    }
    
    static void maisVotado(int[] vetX){
        int Maior = 0, indexM=0;
        
        for (int i = 0; i < vetX.length; i++){
            if (vetX[i] > Maior){
                Maior = vetX[i];
                indexM = i;
            }
        }
        System.out.print("Candidato mais votado: ");
        if (indexM == 1)
            System.out.println("Joao");
        else if (indexM == 2)
            System.out.println("Maria");
        else if (indexM == 3)
            System.out.println("Pedro");
        else
            System.out.println("Luis");
    }
    
    static int returnBrancos(int[] vetB){
        return vetB[0];
    }
    
    static double percJoao(int[] vetJ,int total){
        return (vetJ[1] * 100) / total;
    }
    
    static double percMaria(int[] vetM, int total){
        return (vetM[2] * 100) / total;
    }
    
    static double percPedro(int[] vetP, int total){
        return (vetP[3] * 100) / total;
    }
    
    static double percLuis(int[] vetL, int total){
        return (vetL[4] * 100) / total;
    }
    
    static void showVetor(int[] vetX){
        System.out.print("Votos: ");
        for (int voto : vetX) {
            System.out.print(voto+", ");
        }
        System.out.println("");
    }
}
