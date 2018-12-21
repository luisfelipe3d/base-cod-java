/*
Faça um programa para ler números inteiros digitados pelo usuário e 
armazená-los em dois vetores (A e B), segundo a seguinte regra: o vetor A 
deverá armazenar apenas números pares e o vetor B apenas números ímpares. Os 
vetores (A e B) devem ter capacidade para armazenar, no máximo, 50 números cada
um O programa deverá ter os seguintes subprogramas:
(a) Uma função para inserir UM novo valor em um vetor. Esta função recebe como
parâmetros o vetor onde será feita a inserção, a quantidade de posições já 
preenchidas nesse vetor e o valor a ser inserido. A inserção do novo valor deve
ocorrer na primeira posição livre do vetor. Pré-requisitos para a inserção: 
deve haver espaço livre no vetor e não devem ser inseridos valores repetidos. 
A função deverá retornar a quantidade de posições preenchidas no vetor 
atualizada.
(b) Uma função de busca. Esta função recebe como parâmetro o vetor onde será 
feita a busca, a quantidade de posições já preenchidas nesse vetor e o valor a
ser procurado. A função deve retornar a posição do vetor onde o valor foi 
encontrado ou  -1, caso não encontre o valor procurado.
(c) Um procedimento para exibir os valores armazenados em um vetor. Este 
procedimento recebe como parâmetro o vetor a ser exibido e a quantidade de 
posições preenchidas nesse vetor.
(d) Uma função para remover UM valor de um vetor. Esta função deve receber 
como parâmetros o vetor onde será feita a remoção, a quantidade de posições já
preenchidas nesse vetor e o valor a ser removido. A função deve procurar o 
valor (utilizando a função definida no item (b)) e, caso encontre, remover. 
A função deverá retornar a quantidade de posições preenchidas no vetor 
atualizada.
O programa deverá ter um menu (vide abaixo) que permitirá ao usuário executar 
as opções de inserção, busca, remoção e exibição a qualquer momento e quantas 
vezes desejar.
Menu de opções:
1 – Armazenar número
2 – Procurar número
3 – Exibir números pares
4 – Exibir números ímpares
5 – Remover número
6 – Encerrar programa
Digite a opção desejada: 
 */
package ip2.lista3;
import java.util.Scanner;

public class q1_lista3 {
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
                    }
                    else{
                        verificaNum(vetBimpar,indexImpar,novoNum);
                    }

                    //verifica se número é par
                    /*if (isPar(novoNum)){
                    //verifica se o vetor está completo    
                        if (indexPar < vetApar.length){
                    //compara o número digitado com os números dentro do vetor        
                            for (int i = 0; i < indexPar; i++){
                                
                                if (vetApar[i] == novoNum){
                                    System.out.printf("Este número %d foi "
                                            + "adicionado anteriormente\n"
                                            ,novoNum);
                                    break;   
                                } // fim if 
                            } // fim do for
                            
                            indexPar = insertNum(vetApar,indexPar,novoNum);
                            System.out.println("Valor inserido.P"); 
                        }else
                            System.out.println("Vetor Par está cheio.");   
                    }else{
                    //verifica se o vetor está completo    
                        if(indexImpar < vetBimpar.length){
                    //compara o número digitado com os números dentro do vetor        
                            for (int i = 0; i < indexImpar; i++){
                                
                                if (vetBimpar[i] == novoNum){
                                    System.out.printf("Este número %d foi "
                                            + "adicionado anteriormente\n"
                                            ,novoNum);
                                    break;
                                } // fim if
                            } // fim do for
                            indexImpar = insertNum(vetBimpar,indexImpar,novoNum);
                            System.out.println("Valor inserido.I");
                        }else
                            System.out.println("Vetor Impar está cheio.");
                    } // fim isPar*/
                    break;
                case 2:
                    System.out.println("Procurar número: ");
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
                    System.out.println("5 - Remover número");
                    break;
                case 6:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida");
            } // fim switch
            
        } while (op != 6);
    } // fim psvm
    
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
                            
            indexQ = insertNum(vetQ,indexQ,num);
            System.out.println(insertNum(vetQ,indexQ,num));
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
} // fim q1_lista3
