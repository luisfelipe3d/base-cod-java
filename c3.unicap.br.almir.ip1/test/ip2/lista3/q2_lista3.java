/*
Faça um programa para criar dois vetores (A e B) de números inteiros. Os 
vetores devem ter capacidade para armazenar, no máximo, 50 elementos cada um. 
O vetor A deverá armazenar apenas números pares e o vetor B apenas números 
ímpares. O programa deverá ter os seguintes subprogramas:
(a) Uma função para inserir UM novo valor em um vetor. Esta função recebe como
parâmetros o vetor onde será feita a inserção, a quantidade de posições já 
preenchidas nesse vetor e o valor a ser inserido. A inserção do um novo valor 
deve ocorrer sempre na “posição correta do vetor” de forma que os valores 
estejam sempre ordenados em ordem crescente. Pré-requisitos para a inserção: 
deve haver espaço livre no vetor e não devem ser inseridos valores repetidos. 
A função deverá retornar a quantidade de posições preenchidas no vetor 
atualizada.
(b) Uma função de busca. Uma função que recebe como parâmetro o vetor onde será
feita a busca, a quantidade de posições preenchidas nesse vetor e o valor a ser
procurado. A função deve retornar a posição do vetor onde o valor foi 
encontrado ou  -1, caso não encontre o valor procurado. 
OBSERVAÇÃO: Pesquise sobre o algoritmo de busca binária e o utilize na 
implementação desta função.
(c) Um procedimento para exibir os valores armazenados em um vetor. 
Este procedimento recebe como parâmetro o vetor a ser exibido e a quantidade 
de posições preenchidas nesse vetor.
(d) Uma função para remover UM valor de um vetor. Esta função deve receber como
parâmetros o vetor onde será feita a remoção, a quantidade de posições já 
preenchidas nesse vetor e o valor a ser removido. A função deve procurar o 
valor (utilizando a função definida no item (b)) e, caso encontre, remover. 
A função deverá retornar a quantidade de posições preenchidas no vetor atualizada.
 */
package ip2.lista3;
import java.util.Scanner;
/**
 *
 * @author luisfelipe3d
 */
public class q2_lista3 {
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
