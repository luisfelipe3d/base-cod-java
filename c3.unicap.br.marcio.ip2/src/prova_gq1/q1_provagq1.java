/*
1ª Questão - Faça um programa que solicite que o usuário digite a quantidade 
de anos (N) que está realizando o levantamento do saldo bancário de uma empresa
e depois leia todos estes saldos mensais e armazene-as numa matriz de tamanho 
Nx12 (1,0 ponto), depois gere e imprima as seguintes as seguintes informações: 
A. Um vetor de tamanho N contendo o maior saldo bancário de cada ano (1,0 ponto)
B. Um vetor contendo o saldo bancário médio de cada ano. (1,0 ponto)
C. O mês e o ano que teve o maior saldo bancário (1,0 ponto)
D. Um vetor de tamanho 12 contendo o saldo médio de cada mês 
    nestes N anos (1,0 ponto)
E. O mês, que em média, possui o maior saldo bancário da empresa (1,0 ponto).
 */
package prova_gq1;

import java.util.Scanner;

public class q1_provagq1 {
    public static void main(String[] args) {
        double[][] saldos;
        double[] maiorSaldoPorAno, saldoMedio, mediaPorMes;
        int[] mesAnomaiorSaldo;
        int n, mesMaiorSaldo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantdade de anos: ");
        n = entrada.nextInt();
        saldos = new double[n][12];
        preenche(saldos);
        maiorSaldoPorAno = maiorSaldoPorAno(saldos);
        System.out.println("Maior saldo por ano");
        imprime(maiorSaldoPorAno);
        saldoMedio = saldoMedio(saldos);
        System.out.println("\nSaldo bancário médio por ano");
        imprime(saldoMedio);
        mesAnomaiorSaldo = maiorSaldo(saldos);
        System.out.println("\nO mes e ano com o maior saldo foi " +
                mesAnomaiorSaldo[0] + "/" + (2019 - mesAnomaiorSaldo[1]));
        mediaPorMes = mediaPorMes(saldos);
        System.out.println("\nSaldo bancário médio por mês");
        imprime(mediaPorMes);
        mesMaiorSaldo = mesMaiorSaldo(mediaPorMes);
        System.out.println("\nO mês que em média tem o maior saldo é " +
                mesMaiorSaldo);
    }
    
    public static double[] maiorSaldoPorAno(double[][] saldos) {
        double[] maiores = new double[saldos.length];
        int i, j;
        for (i = 0; i < saldos.length; i = i + 1) {
            maiores[i] = saldos[i][0];
            for (j = 1; j < saldos[0].length; j = j + 1) {
                if (saldos[i][j] > maiores[i]) {
                    maiores[i] = saldos[i][j];
                }
            }
        }
        return maiores;
    }
    
    public static double[] saldoMedio(double[][] saldos) {
        double[] media = new double[saldos.length];
        int i, j;
        for (i = 0; i < saldos.length; i = i + 1) {
            media[i] = 0;
            for (j = 0; j < saldos[0].length; j = j + 1) {
                media[i] = media[i] + saldos[i][j];
            }
            media[i] = media[i] / saldos[0].length;
        }
        return media;
    }
    
    public static int[] maiorSaldo(double[][] saldos) {
        int[] result = new int[2];
        int i, j;
        double maior = saldos[0][0];
        result[0] = 1;
        result[1] = 1;
        for (i = 0; i < saldos.length; i = i + 1) {
            for (j = 0; j < saldos[0].length; j = j + 1) {
                if (saldos[i][j] > maior) {
                    maior = saldos[i][j];
                    result[0] = j + 1;
                    result[1] = i + 1;
                }
            }
        }
        return result;
    }
    
    public static double[] mediaPorMes(double[][] saldos) {
        double[] media = new double[saldos[0].length];
        int i, j;
        for (j = 0; j < saldos[0].length; j = j + 1) {
            media[j] = 0;
            for (i = 0; i < saldos.length; i = i + 1) {
                media[j] = media[j] + saldos[i][j];
            }
            media[j] = media[j] / saldos.length;
        }
        return media;
    }
    
    public static int mesMaiorSaldo(double[] saldoMedio) {
        int maior = 0, i;
        for (i = 1; i < saldoMedio.length; i = i + 1) {
            if (saldoMedio[i] > saldoMedio[maior]) {
                maior = i;
            }
        }
        return maior + 1;
    }
    
    private static void preenche(double[][] saldos) {
        int i, j;
        for (i = 0; i < saldos.length; i = i + 1) {
            for (j = 0; j < saldos[0].length; j = j + 1) {
                saldos[i][j] = Math.random() * 10000;
            }
        }
    }
    
    private static void imprime(double[] v) {
        int i;
        for (i = 0; i < v.length; i = i + 1) {
            System.out.printf("%.2f\t", v[i]);
        }
        System.out.println();
    }
}
